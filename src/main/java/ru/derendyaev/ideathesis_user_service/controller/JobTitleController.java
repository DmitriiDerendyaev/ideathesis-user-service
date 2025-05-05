package ru.derendyaev.ideathesis_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.service.JobTitleService;

import java.util.List;

@RestController
@RequestMapping("/api/job-titles")
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping
    public List<JobTitle> getAllJobTitles() {
        return jobTitleService.getAllJobTitles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobTitle> getJobTitleById(@PathVariable Long id) {
        return jobTitleService.getJobTitleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
