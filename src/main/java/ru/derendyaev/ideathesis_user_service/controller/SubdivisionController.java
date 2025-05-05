package ru.derendyaev.ideathesis_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.model.Subdivision;
import ru.derendyaev.ideathesis_user_service.service.SubdivisionService;

import java.util.List;

@RestController
@RequestMapping("/api/subdivisions")
public class SubdivisionController {

    @Autowired
    private SubdivisionService subdivisionService;

    @GetMapping
    public List<Subdivision> getAllSubdivisions() {
        return subdivisionService.getAllSubdivisions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subdivision> getSubdivisionById(@PathVariable Long id) {
        return subdivisionService.getSubdivisionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
