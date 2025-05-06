package ru.derendyaev.ideathesis_user_service.studentGroup.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentGroupDto {
    private Long id;
    private String name;
}