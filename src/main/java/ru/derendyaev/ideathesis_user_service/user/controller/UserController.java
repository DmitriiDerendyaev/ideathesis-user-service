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
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
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

}