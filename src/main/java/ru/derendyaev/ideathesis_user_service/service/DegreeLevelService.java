package ru.derendyaev.ideathesis_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.model.DegreeLevel;
import ru.derendyaev.ideathesis_user_service.repository.DegreeLevelRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DegreeLevelService {

    @Autowired
    private DegreeLevelRepository degreeLevelRepository;

    public List<DegreeLevel> getAllDegreeLevels() {
        return degreeLevelRepository.findAll();
    }

    public Optional<DegreeLevel> getDegreeLevelById(Long id) {
        return degreeLevelRepository.findById(id);
    }
}
