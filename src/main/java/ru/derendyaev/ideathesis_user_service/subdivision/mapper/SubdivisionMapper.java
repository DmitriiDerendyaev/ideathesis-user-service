package ru.derendyaev.ideathesis_user_service.subdivision.mapper;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.subdivision.dto.SubdivisionDto;
import ru.derendyaev.ideathesis_user_service.subdivision.model.Subdivision;

@Component
public class SubdivisionMapper {

    public SubdivisionDto toSubdivisionDto(Subdivision subdivision) {
        return SubdivisionDto.builder()
                .id(subdivision.getId())
                .name(subdivision.getName())
                .guid(subdivision.getGuid())
                .build();
    }
}
