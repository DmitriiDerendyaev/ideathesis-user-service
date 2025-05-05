package ru.derendyaev.ideathesis_user_service.jobTitle.mapper;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.jobTitle.dto.JobTitleDto;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;

@Component
public class JobTitleMapper {

    public JobTitleDto toJobTitleDto(JobTitle jobTitle) {
        return JobTitleDto.builder()
                .id(jobTitle.getId())
                .name(jobTitle.getName())
                .build();
    }
}
