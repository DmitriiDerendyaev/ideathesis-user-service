package ru.derendyaev.ideathesis_user_service.user.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class UserAllDto {
    private UUID guid;
    private String fullName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String userType;
    private Long version;
    private Date createdAt;
    private Date updatedAt;
}
