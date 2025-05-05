package ru.derendyaev.ideathesis_user_service.studentGroup.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.studentGroup.dto.StudentGroupDto;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;

@Component
public class StudentGroupMapper {

    public StudentGroupDto toStudentGroupDto(StudentGroup studentGroup) {
        return StudentGroupDto.builder()
                .id(studentGroup.getId())
                .name(studentGroup.getName())
                .build();
    }
}
