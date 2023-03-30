package com.example.demo.exceptions;

import com.example.demo.dto.MessageDTO;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<MessageDTO> notFoundException(NotFoundException exeption){
        return ResponseEntity.status(404).body(
                MessageDTO.builder()
                        .message(exeption.getMessage())
                        .action("BUSCAR")
                        .build()
        );
    }

}
