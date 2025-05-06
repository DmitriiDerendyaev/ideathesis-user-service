package ru.derendyaev.ideathesis_user_service.staffCategory.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StaffCategoryDto {
    private Long id;
    private String name;
}
