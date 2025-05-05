package ru.derendyaev.ideathesis_user_service.employmentType.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.employmentType.service.EmploymentTypeService;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;

import java.util.List;

@RestController
@RequestMapping("/api/employment-types")
public class EmploymentTypeController {

    @Autowired
    private EmploymentTypeService employmentTypeService;

    @GetMapping
    public List<EmploymentType> getAllEmploymentTypes() {
        return employmentTypeService.getAllEmploymentTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmploymentType> getEmploymentTypeById(@PathVariable Long id) {
        return employmentTypeService.getEmploymentTypeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
