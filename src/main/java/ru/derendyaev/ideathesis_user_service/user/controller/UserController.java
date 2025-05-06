package ru.derendyaev.ideathesis_user_service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.derendyaev.ideathesis_user_service.user.dto.UserAllDto;
import ru.derendyaev.ideathesis_user_service.user.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserAllDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{guid}")
    public ResponseEntity<UserAllDto> getUserById(@PathVariable UUID guid) {
        return ResponseEntity.ok(userService.getUserById(guid));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserAllDto> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }
}