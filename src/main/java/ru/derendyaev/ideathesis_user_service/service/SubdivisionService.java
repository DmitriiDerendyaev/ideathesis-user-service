package ru.derendyaev.ideathesis_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.model.Subdivision;
import ru.derendyaev.ideathesis_user_service.repository.SubdivisionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SubdivisionService {

    @Autowired
    private SubdivisionRepository subdivisionRepository;

    public List<Subdivision> getAllSubdivisions() {
        return subdivisionRepository.findAll();
    }

    public Optional<Subdivision> getSubdivisionById(Long id) {
        return subdivisionRepository.findById(id);
    }
}
