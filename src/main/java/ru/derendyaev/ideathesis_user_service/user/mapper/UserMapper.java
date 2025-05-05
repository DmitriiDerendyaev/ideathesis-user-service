package ru.derendyaev.ideathesis_user_service.user.mapper;

import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.user.dto.UserAllDto;
import ru.derendyaev.ideathesis_user_service.user.model.User;

@Component
public class UserMapper {

    public UserAllDto toUserAllDto(User user) {
        return UserAllDto.builder()
                .guid(user.getGuid())
                .fullName(user.getFullName())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .middleName(user.getMiddleName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .userType(user.getUserType())
                .version(user.getVersion())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}