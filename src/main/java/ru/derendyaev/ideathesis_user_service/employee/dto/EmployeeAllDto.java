package ru.derendyaev.ideathesis_user_service.employee.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class EmployeeAllDto {
    private UUID guid;
    private String fullName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String userType;
    private Long version;
    private Date createdAt;
    private Date updatedAt;
    private String surname;
    private Date dateOfBirth;
    private List<EmployeeEmploymentAllDto> employeeEmployments;
}