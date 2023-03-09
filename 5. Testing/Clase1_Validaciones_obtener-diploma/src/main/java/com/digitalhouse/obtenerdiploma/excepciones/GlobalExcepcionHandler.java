package com.digitalhouse.obtenerdiploma.excepciones;

import com.digitalhouse.obtenerdiploma.dto.ValidationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExcepcionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationDTO> errorDTO(MethodArgumentNotValidException e){
        return ResponseEntity.ok(
                new ValidationDTO(
                        e.getAllErrors().stream().map(error -> error.getDefaultMessage()).collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ValidationDTO> obtenerDiplomaExceptionController(ConstraintViolationException e){
        return ResponseEntity.ok(
                new ValidationDTO(
                        e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())
                )
        );
    }
}
