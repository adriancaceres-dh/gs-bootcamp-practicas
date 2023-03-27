package com.exercise.demo.controller;

import com.exercise.demo.dto.request.UserRequestDTO;
import com.exercise.demo.dto.response.MessageResponseDTO;
import com.exercise.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class UserController {
    UserService userService;

    public UserController ( UserService userService ) {
        this.userService = userService;
    }

    @PutMapping("/users/login")
    public ResponseEntity<MessageResponseDTO> login ( @RequestBody UserRequestDTO user ) {
        var res = userService.login(user);
        return new ResponseEntity<>(res, CREATED);
    }
}
