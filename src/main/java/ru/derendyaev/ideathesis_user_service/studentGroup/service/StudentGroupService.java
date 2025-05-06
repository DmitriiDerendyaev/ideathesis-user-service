package ru.derendyaev.ideathesis_user_service.studentGroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;
import ru.derendyaev.ideathesis_user_service.studentGroup.repository.StudentGroupRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentGroupService {

    @Autowired
    private StudentGroupRepository studentGroupRepository;

    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupRepository.findAll();
    }

    public Optional<StudentGroup> getStudentGroupById(Long id) {
        return studentGroupRepository.findById(id);
    }
}
