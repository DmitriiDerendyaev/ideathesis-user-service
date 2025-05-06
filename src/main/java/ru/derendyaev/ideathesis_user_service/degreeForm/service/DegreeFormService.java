package ru.derendyaev.ideathesis_user_service.degreeForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;
import ru.derendyaev.ideathesis_user_service.degreeForm.repository.DegreeFormRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DegreeFormService {

    @Autowired
    private DegreeFormRepository degreeFormRepository;

    public List<DegreeForm> getAllDegreeForms() {
        return degreeFormRepository.findAll();
    }

    public Optional<DegreeForm> getDegreeFormById(Long id) {
        return degreeFormRepository.findById(id);
    }
}
