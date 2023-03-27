package com.exercise.demo.service;

import com.exercise.demo.dto.request.UserRequestDTO;
import com.exercise.demo.dto.response.MessageResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public MessageResponseDTO login( UserRequestDTO userDto){
        MessageResponseDTO responseDTO = new MessageResponseDTO();
        if(userDto.getUserName() == null || userDto.getPassword() == null){
            responseDTO.setMessage("Login Fail");
        }
        responseDTO.setMessage("Login Correct");
        return responseDTO;
    }
}
