package ru.derendyaev.ideathesis_user_service.jobTitle.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobTitleDto {
    private Long id;
    private String name;
}
