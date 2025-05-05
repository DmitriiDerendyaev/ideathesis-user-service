package ru.derendyaev.ideathesis_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.model.DegreeForm;
import ru.derendyaev.ideathesis_user_service.service.DegreeFormService;

import java.util.List;

@RestController
@RequestMapping("/api/degree-forms")
public class DegreeFormController {

    @Autowired
    private DegreeFormService degreeFormService;

    @GetMapping
    public List<DegreeForm> getAllDegreeForms() {
        return degreeFormService.getAllDegreeForms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DegreeForm> getDegreeFormById(@PathVariable Long id) {
        return degreeFormService.getDegreeFormById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
