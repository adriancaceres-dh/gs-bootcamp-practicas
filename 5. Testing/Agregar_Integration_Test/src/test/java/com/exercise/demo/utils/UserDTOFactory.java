package com.exercise.demo.utils;

import com.exercise.demo.dto.request.UserRequestDTO;

public class UserDTOFactory {
    public static UserRequestDTO getUser1(){
        return UserRequestDTO.builder()
                .userName("Stefano")
                .password("12345")
                .build();
    }
}
