package ru.derendyaev.ideathesis_user_service.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.employee.model.EmployeeEmployment;
import ru.derendyaev.ideathesis_user_service.employee.repository.EmployeeEmploymentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeEmploymentService {

    @Autowired
    private EmployeeEmploymentRepository employeeEmploymentRepository;

    public List<EmployeeEmployment> getAllEmployeeEmployments() {
        return employeeEmploymentRepository.findAll();
    }

    public Optional<EmployeeEmployment> getEmployeeEmploymentById(Long id) {
        return employeeEmploymentRepository.findById(id);
    }
}
