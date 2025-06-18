package ru.derendyaev.ideathesis_user_service.employee.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.mapper.EmployeeMapper;
import ru.derendyaev.ideathesis_user_service.employee.model.Employee;
import ru.derendyaev.ideathesis_user_service.employee.repository.EmployeeRepository;
import ru.derendyaev.ideathesis_user_service.exception.ObjectNotFoundException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

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

    public List<EmployeeAllDto> searchEmployeesByFullName(String fullName) {
        return employeeRepository.findByFullNameContainingIgnoreCase(fullName, PageRequest.of(0, 10)).stream()
                .map(employeeMapper::toEmployeeAllDto)
                .collect(Collectors.toList());
    }

    public List<EmployeeAllDto> searchEmployeesBySubdivisionAndFullName(
            String subdivisionName, String fullName, int page, int size) {
        String trimmedSubdivision = subdivisionName != null ? subdivisionName.trim() : null;
        String trimmedFullName = fullName != null ? fullName.trim() : null;

        if (trimmedSubdivision != null && trimmedSubdivision.isEmpty()) {
            trimmedSubdivision = null;
        }
        if (trimmedFullName != null && trimmedFullName.isEmpty()) {
            trimmedFullName = null;
        }

        Pageable pageable = PageRequest.of(page, size);
        List<Employee> employees = employeeRepository.findEmployeesBySubdivisionAndFullName(trimmedSubdivision, trimmedFullName, pageable);
        return employees.stream()
                .map(employeeMapper::toEmployeeAllDto)
                .collect(Collectors.toList());
    }
}