package ru.derendyaev.ideathesis_user_service.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.service.EmployeeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
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

    @GetMapping("/search")
    public List<EmployeeAllDto> searchEmployeesByFullName(@RequestParam String fullName) {
        return employeeService.searchEmployeesByFullName(fullName);
    }

    @GetMapping("/search-by-subdivision")
    public List<EmployeeAllDto> searchEmployeesBySubdivisionAndFullName(
            @RequestParam(required = false) String subdivisionName,
            @RequestParam(required = false) String fullName,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return employeeService.searchEmployeesBySubdivisionAndFullName(subdivisionName, fullName, page, size);
    }
}