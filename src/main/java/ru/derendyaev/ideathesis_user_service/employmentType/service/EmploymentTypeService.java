package ru.derendyaev.ideathesis_user_service.employmentType.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;
import ru.derendyaev.ideathesis_user_service.employmentType.repository.EmploymentTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmploymentTypeService {

    @Autowired
    private EmploymentTypeRepository employmentTypeRepository;

    public List<EmploymentType> getAllEmploymentTypes() {
        return employmentTypeRepository.findAll();
    }

    public Optional<EmploymentType> getEmploymentTypeById(Long id) {
        return employmentTypeRepository.findById(id);
    }
}
