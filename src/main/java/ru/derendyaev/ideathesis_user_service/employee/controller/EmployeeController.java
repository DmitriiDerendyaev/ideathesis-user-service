package ru.derendyaev.ideathesis_user_service.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.service.EmployeeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeAllDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{guid}")
    public ResponseEntity<EmployeeAllDto> getEmployeeById(@PathVariable UUID guid) {
        return ResponseEntity.ok(employeeService.getEmployeeById(guid));
    }
}