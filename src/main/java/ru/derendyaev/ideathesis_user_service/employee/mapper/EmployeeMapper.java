package ru.derendyaev.ideathesis_user_service.employee.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeAllDto;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeEmploymentAllDto;
import ru.derendyaev.ideathesis_user_service.employee.model.Employee;
import ru.derendyaev.ideathesis_user_service.employee.model.EmployeeEmployment;
import ru.derendyaev.ideathesis_user_service.employee.repository.EmployeeEmploymentRepository;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;
import ru.derendyaev.ideathesis_user_service.subdivision.model.Subdivision;
import ru.derendyaev.ideathesis_user_service.user.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    @Autowired
    private EmployeeEmploymentRepository employeeEmploymentRepository;

    public EmployeeAllDto toEmployeeAllDto(Employee employee) {
        User user = employee.getUser();
        List<EmployeeEmploymentAllDto> employeeEmployments = employee.getEmployeeEmployments().stream()
                .map(this::toEmployeeEmploymentAllDto)
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

    private EmployeeEmploymentAllDto toEmployeeEmploymentAllDto(EmployeeEmployment employment) {
        JobTitle jobTitle = employment.getJobTitle();
        StaffCategory staffCategory = employment.getStaffCategory();
        EmploymentType employmentType = employment.getEmploymentType();
        Subdivision subdivision = employment.getSubdivision();

        return EmployeeEmploymentAllDto.builder()
                .id(employment.getId())
                .employeeGuid(employment.getEmployee().getGuid())
                .jobTitle(jobTitle)
                .staffCategory(staffCategory)
                .employmentType(employmentType)
                .subdivision(subdivision)
                .jobState(employment.getJobState())
                .build();
    }
}