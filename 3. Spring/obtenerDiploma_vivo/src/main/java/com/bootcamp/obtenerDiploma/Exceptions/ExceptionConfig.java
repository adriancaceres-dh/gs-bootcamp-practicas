package com.bootcamp.obtenerDiploma.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(AlumnoException.class)
    public ResponseEntity<?> alumnoExcpetion(AlumnoException alumnoException){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(alumnoException.getMensaje());
    }
}
