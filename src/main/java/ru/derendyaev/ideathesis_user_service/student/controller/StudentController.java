package ru.derendyaev.ideathesis_user_service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.derendyaev.ideathesis_user_service.student.dto.StudentAllDto;
import ru.derendyaev.ideathesis_user_service.student.service.StudentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
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

    @GetMapping("/search")
    public List<StudentAllDto> searchStudents(
            @RequestParam(required = false) String groupName,
            @RequestParam(required = false) String departmentName,
            @RequestParam(required = false) String fullName,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return studentService.searchStudentsByGroupDepartmentAndFullName(groupName, departmentName, fullName, page, size);
    }
}