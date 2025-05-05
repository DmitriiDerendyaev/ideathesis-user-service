package ru.derendyaev.ideathesis_user_service.degreeLevel.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.degreeLevel.dto.DegreeLevelDto;
import ru.derendyaev.ideathesis_user_service.degreeLevel.model.DegreeLevel;

@Component
public class DegreeLevelMapper {

    public DegreeLevelDto toDegreeLevelDto(DegreeLevel degreeLevel) {
        return DegreeLevelDto.builder()
                .id(degreeLevel.getId())
                .name(degreeLevel.getName())
                .build();
    }
}
