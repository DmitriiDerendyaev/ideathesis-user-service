package ru.derendyaev.ideathesis_user_service.employmentType.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.employmentType.dto.EmploymentTypeDto;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;

@Component
public class EmploymentTypeMapper {

    public EmploymentTypeDto toEmploymentTypeDto(EmploymentType employmentType) {
        return EmploymentTypeDto.builder()
                .id(employmentType.getId())
                .name(employmentType.getName())
                .build();
    }
}
