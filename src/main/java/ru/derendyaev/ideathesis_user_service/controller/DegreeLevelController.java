package ru.derendyaev.ideathesis_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.model.DegreeLevel;
import ru.derendyaev.ideathesis_user_service.service.DegreeLevelService;

import java.util.List;

@RestController
@RequestMapping("/api/degree-levels")
public class DegreeLevelController {

    @Autowired
    private DegreeLevelService degreeLevelService;

    @GetMapping
    public List<DegreeLevel> getAllDegreeLevels() {
        return degreeLevelService.getAllDegreeLevels();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DegreeLevel> getDegreeLevelById(@PathVariable Long id) {
        return degreeLevelService.getDegreeLevelById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
