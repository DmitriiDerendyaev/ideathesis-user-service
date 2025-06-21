package ru.derendyaev.ideathesis_user_service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.exception.ObjectNotFoundException;
import ru.derendyaev.ideathesis_user_service.student.dto.StudentAllDto;
import ru.derendyaev.ideathesis_user_service.student.mapper.StudentMapper;
import ru.derendyaev.ideathesis_user_service.student.model.Student;
import ru.derendyaev.ideathesis_user_service.student.repository.StudentRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentAllDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::toStudentAllDto)
                .collect(Collectors.toList());
    }

    public StudentAllDto getStudentById(UUID guid) {
        return studentRepository.findById(guid)
                .map(studentMapper::toStudentAllDto)
                .orElseThrow(() -> new ObjectNotFoundException("Student with guid " + guid + " not found"));
    }

    public List<StudentAllDto> searchStudentsByGroupDepartmentAndFullName(
            String groupName, String departmentName, String fullName, int page, int size) {
        String trimmedGroup = groupName != null ? groupName.trim() : null;
        String trimmedDepartment = departmentName != null ? departmentName.trim() : null;
        String trimmedFullName = fullName != null ? fullName.trim() : null;

        if (trimmedGroup != null && trimmedGroup.isEmpty()) {
            trimmedGroup = null;
        }
        if (trimmedDepartment != null && trimmedDepartment.isEmpty()) {
            trimmedDepartment = null;
        }
        if (trimmedFullName != null && trimmedFullName.isEmpty()) {
            trimmedFullName = null;
        }

        Pageable pageable = PageRequest.of(page, size);
        List<Student> students = studentRepository.findStudentsByGroupDepartmentAndFullName(trimmedGroup, trimmedDepartment, trimmedFullName, pageable);
        return students.stream()
                .map(studentMapper::toStudentAllDto)
                .collect(Collectors.toList());
    }
}