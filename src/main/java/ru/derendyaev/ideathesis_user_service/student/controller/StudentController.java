package ru.derendyaev.ideathesis_user_service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.student.dto.StudentAllDto;
import ru.derendyaev.ideathesis_user_service.student.model.Student;
import ru.derendyaev.ideathesis_user_service.student.service.StudentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentAllDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{guid}")
    public ResponseEntity<StudentAllDto> getStudentById(@PathVariable UUID guid) {
        return ResponseEntity.ok(studentService.getStudentById(guid));
    }
}