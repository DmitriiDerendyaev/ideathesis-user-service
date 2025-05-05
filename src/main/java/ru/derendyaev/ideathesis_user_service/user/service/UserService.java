package ru.derendyaev.ideathesis_user_service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.exception.ObjectNotFoundException;
import ru.derendyaev.ideathesis_user_service.user.dto.UserAllDto;
import ru.derendyaev.ideathesis_user_service.user.mapper.UserMapper;
import ru.derendyaev.ideathesis_user_service.user.model.User;
import ru.derendyaev.ideathesis_user_service.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserAllDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toUserAllDto)
                .collect(Collectors.toList());
    }

    public UserAllDto getUserById(UUID guid) {
        return userRepository.findById(guid)
                .map(userMapper::toUserAllDto)
                .orElseThrow(() -> new ObjectNotFoundException("User with guid " + guid + " not found"));
    }

    public UserAllDto getUserByEmail(String email) {
        return Optional.ofNullable(userRepository.findByEmail(email))
                .map(userMapper::toUserAllDto)
                .orElseThrow(() -> new ObjectNotFoundException("User with email " + email + " not found"));
    }
}