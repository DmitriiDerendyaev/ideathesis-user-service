package ru.derendyaev.ideathesis_user_service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.exception.ObjectNotFoundException;
import ru.derendyaev.ideathesis_user_service.student.dto.StudentAllDto;
import ru.derendyaev.ideathesis_user_service.student.mapper.StudentMapper;
import ru.derendyaev.ideathesis_user_service.student.model.Student;
import ru.derendyaev.ideathesis_user_service.student.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
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
}