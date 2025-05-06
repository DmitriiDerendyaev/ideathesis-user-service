package ru.derendyaev.ideathesis_user_service.department.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.department.dto.DepartmentDto;
import ru.derendyaev.ideathesis_user_service.department.model.Department;

@Component
public class DepartmentMapper {

    public DepartmentDto toDepartmentDto(Department department) {
        return DepartmentDto.builder()
                .id(department.getId())
                .name(department.getName())
                .build();
    }
}
