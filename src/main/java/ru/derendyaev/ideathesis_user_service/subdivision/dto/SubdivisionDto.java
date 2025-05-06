package ru.derendyaev.ideathesis_user_service.subdivision.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class SubdivisionDto {
    private Long id;
    private String name;
    private UUID guid;
}
