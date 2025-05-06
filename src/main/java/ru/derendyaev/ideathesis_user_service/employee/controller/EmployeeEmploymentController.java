package ru.derendyaev.ideathesis_user_service.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.employee.model.EmployeeEmployment;
import ru.derendyaev.ideathesis_user_service.employee.service.EmployeeEmploymentService;

import java.util.List;

@RestController
@RequestMapping("/api/employee-employments")
public class EmployeeEmploymentController {

    @Autowired
    private EmployeeEmploymentService employeeEmploymentService;

    @GetMapping
    public List<EmployeeEmployment> getAllEmployeeEmployments() {
        return employeeEmploymentService.getAllEmployeeEmployments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEmployment> getEmployeeEmploymentById(@PathVariable Long id) {
        return employeeEmploymentService.getEmployeeEmploymentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
