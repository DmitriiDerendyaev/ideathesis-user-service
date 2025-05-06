package ru.derendyaev.ideathesis_user_service.employmentType.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmploymentTypeDto {
    private Long id;
    private String name;
}