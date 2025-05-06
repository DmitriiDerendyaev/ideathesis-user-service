package ru.derendyaev.ideathesis_user_service.student.dto;

import lombok.Builder;
import lombok.Data;
import ru.derendyaev.ideathesis_user_service.degreeForm.dto.DegreeFormDto;
import ru.derendyaev.ideathesis_user_service.degreeLevel.dto.DegreeLevelDto;
import ru.derendyaev.ideathesis_user_service.department.dto.DepartmentDto;
import ru.derendyaev.ideathesis_user_service.studentGroup.dto.StudentGroupDto;

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
    private StudentGroupDto studentGroup;
    private DepartmentDto department;
    private DegreeLevelDto degreeLevel;
    private DegreeFormDto degreeForm;
}