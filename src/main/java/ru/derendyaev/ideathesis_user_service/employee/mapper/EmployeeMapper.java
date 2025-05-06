package ru.derendyaev.ideathesis_user_service.employee.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeEmploymentAllDto;
import ru.derendyaev.ideathesis_user_service.employee.model.Employee;
import ru.derendyaev.ideathesis_user_service.user.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    @Autowired
    private EmployeeEmploymentMapper employeeEmploymentMapper;

    public EmployeeAllDto toEmployeeAllDto(Employee employee) {
        User user = employee.getUser();
        List<EmployeeEmploymentAllDto> employeeEmployments = employee.getEmployeeEmployments().stream()
                .map(employeeEmploymentMapper::toEmployeeEmploymentAllDto)
                .collect(Collectors.toList());

        return EmployeeAllDto.builder()
                .guid(employee.getGuid())
                .fullName(user.getFullName())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .middleName(user.getMiddleName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .userType(user.getUserType())
                .version(user.getVersion())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .surname(employee.getSurname())
                .dateOfBirth(employee.getDateOfBirth())
                .employeeEmployments(employeeEmployments)
                .build();
    }
}