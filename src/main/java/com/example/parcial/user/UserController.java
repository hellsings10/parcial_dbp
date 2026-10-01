package com.example.parcial.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/auth/register")
    public ResponseEntity<UserOutputDTO> createUser(@RequestBody UserInputDTO userInputDTO)
    {
        UserOutputDTO userOutputDTO = userService.createUser(userInputDTO);

        return ResponseEntity.ok(userOutputDTO);
    }
}
