package com.glubits.repasoJPA.exceptions;

import com.glubits.repasoJPA.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<MessageDTO> notFoundException(NotFoundException e){
        return ResponseEntity.status(404).body(
                MessageDTO.builder()
                        .message(e.getMessage())
                        .action("BUSQUEDA")
                        .build()
        );
    }
}
