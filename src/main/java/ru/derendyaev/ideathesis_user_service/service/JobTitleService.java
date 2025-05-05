package ru.derendyaev.ideathesis_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.repository.JobTitleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> getAllJobTitles() {
        return jobTitleRepository.findAll();
    }

    public Optional<JobTitle> getJobTitleById(Long id) {
        return jobTitleRepository.findById(id);
    }
}
