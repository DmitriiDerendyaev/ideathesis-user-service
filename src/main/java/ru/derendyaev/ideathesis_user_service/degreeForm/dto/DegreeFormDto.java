package ru.derendyaev.ideathesis_user_service.degreeForm.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DegreeFormDto {
    private Long id;
    private String name;
}
