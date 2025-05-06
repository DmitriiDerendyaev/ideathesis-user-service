package ru.derendyaev.ideathesis_user_service.studentGroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.studentGroup.service.StudentGroupService;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;

import java.util.List;

@RestController
@RequestMapping("/api/student-groups")
public class StudentGroupController {

    @Autowired
    private StudentGroupService studentGroupService;

    @GetMapping
    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupService.getAllStudentGroups();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentGroup> getStudentGroupById(@PathVariable Long id) {
        return studentGroupService.getStudentGroupById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
