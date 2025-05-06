package ru.derendyaev.ideathesis_user_service.employee.dto;

import lombok.Builder;
import lombok.Data;
import ru.derendyaev.ideathesis_user_service.employmentType.dto.EmploymentTypeDto;
import ru.derendyaev.ideathesis_user_service.jobTitle.dto.JobTitleDto;
import ru.derendyaev.ideathesis_user_service.staffCategory.dto.StaffCategoryDto;
import ru.derendyaev.ideathesis_user_service.subdivision.dto.SubdivisionDto;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class EmployeeEmploymentAllDto {
    private Long id;
    private UUID employeeGuid;
    private JobTitleDto jobTitle;
    private StaffCategoryDto staffCategory;
    private EmploymentTypeDto employmentType;
    private SubdivisionDto subdivision;
    private String jobState;
}
