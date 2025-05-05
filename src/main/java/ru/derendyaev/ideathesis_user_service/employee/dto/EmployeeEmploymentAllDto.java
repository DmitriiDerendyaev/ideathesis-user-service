package ru.derendyaev.ideathesis_user_service.employee.dto;

import lombok.Builder;
import lombok.Data;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;
import ru.derendyaev.ideathesis_user_service.subdivision.model.Subdivision;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class EmployeeEmploymentAllDto {
    private Long id;
    private UUID employeeGuid;
    private JobTitle jobTitle;
    private StaffCategory staffCategory;
    private EmploymentType employmentType;
    private Subdivision subdivision;
    private String jobState;
    private Date createdAt;
    private Date updatedAt;
}
