package ru.derendyaev.ideathesis_user_service.staffCategory.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.staffCategory.dto.StaffCategoryDto;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;

@Component
public class StaffCategoryMapper {

    public StaffCategoryDto toStaffCategoryDto(StaffCategory staffCategory) {
        return StaffCategoryDto.builder()
                .id(staffCategory.getId())
                .name(staffCategory.getName())
                .build();
    }
}
