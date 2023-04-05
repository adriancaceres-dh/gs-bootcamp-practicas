package com.concesionario.ford.exceptions;

import com.concesionario.ford.dto.MessageDTO;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
        public ResponseEntity<MessageDTO> notFoundException(ChangeSetPersister.NotFoundException e){
            return ResponseEntity.status(404).body(
                    MessageDTO.builder()
                            .message(e.getMessage())
                            .action("BUSQUEDA")
                            .build()
            );
        }
    }

