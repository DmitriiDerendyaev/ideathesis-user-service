package ru.derendyaev.ideathesis_user_service.student.dto;

import lombok.Builder;
import lombok.Data;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;
import ru.derendyaev.ideathesis_user_service.degreeLevel.model.DegreeLevel;
import ru.derendyaev.ideathesis_user_service.department.Department;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class StudentAllDto {
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
    private Integer course;
    private Integer startYear;
    private StudentGroup studentGroup;
    private Department department;
    private DegreeLevel degreeLevel;
    private DegreeForm degreeForm;
}