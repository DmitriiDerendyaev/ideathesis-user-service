package ru.derendyaev.ideathesis_user_service.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.mapper.EmployeeMapper;
import ru.derendyaev.ideathesis_user_service.employee.model.Employee;
import ru.derendyaev.ideathesis_user_service.employee.repository.EmployeeRepository;
import ru.derendyaev.ideathesis_user_service.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeAllDto> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::toEmployeeAllDto)
                .collect(Collectors.toList());
    }

    public EmployeeAllDto getEmployeeById(UUID guid) {
        return employeeRepository.findById(guid)
                .map(employeeMapper::toEmployeeAllDto)
                .orElseThrow(() -> new ObjectNotFoundException("Employee with guid " + guid + " not found"));
    }
}