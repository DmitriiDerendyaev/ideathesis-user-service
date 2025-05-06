package ru.derendyaev.ideathesis_user_service.employee.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.employee.dto.EmployeeEmploymentAllDto;
import ru.derendyaev.ideathesis_user_service.employee.model.EmployeeEmployment;
import ru.derendyaev.ideathesis_user_service.employmentType.mapper.EmploymentTypeMapper;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;
import ru.derendyaev.ideathesis_user_service.jobTitle.mapper.JobTitleMapper;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.staffCategory.mapper.StaffCategoryMapper;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;
import ru.derendyaev.ideathesis_user_service.subdivision.mapper.SubdivisionMapper;
import ru.derendyaev.ideathesis_user_service.subdivision.model.Subdivision;

@Component
public class EmployeeEmploymentMapper {

    @Autowired
    private JobTitleMapper jobTitleMapper;

    @Autowired
    private StaffCategoryMapper staffCategoryMapper;

    @Autowired
    private EmploymentTypeMapper employmentTypeMapper;

    @Autowired
    private SubdivisionMapper subdivisionMapper;

    public EmployeeEmploymentAllDto toEmployeeEmploymentAllDto(EmployeeEmployment employment) {
        JobTitle jobTitle = employment.getJobTitle();
        StaffCategory staffCategory = employment.getStaffCategory();
        EmploymentType employmentType = employment.getEmploymentType();
        Subdivision subdivision = employment.getSubdivision();

        return EmployeeEmploymentAllDto.builder()
                .id(employment.getId())
                .employeeGuid(employment.getEmployee().getGuid())
                .jobTitle(jobTitle != null ? jobTitleMapper.toJobTitleDto(jobTitle) : null)
                .staffCategory(staffCategory != null ? staffCategoryMapper.toStaffCategoryDto(staffCategory) : null)
                .employmentType(employmentType != null ? employmentTypeMapper.toEmploymentTypeDto(employmentType) : null)
                .subdivision(subdivision != null ? subdivisionMapper.toSubdivisionDto(subdivision) : null)
                .jobState(employment.getJobState())
                .build();
    }
}