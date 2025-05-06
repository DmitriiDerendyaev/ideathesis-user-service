package ru.derendyaev.ideathesis_user_service.degreeForm.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.degreeForm.dto.DegreeFormDto;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;

@Component
public class DegreeFormMapper {

    public DegreeFormDto toDegreeFormDto(DegreeForm degreeForm) {
        return DegreeFormDto.builder()
                .id(degreeForm.getId())
                .name(degreeForm.getName())
                .build();
    }
}