package ru.derendyaev.ideathesis_user_service.degreeLevel.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DegreeLevelDto {
    private Long id;
    private String name;
}