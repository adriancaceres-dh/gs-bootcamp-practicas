package com.digitalhouse.obtenerdiploma.excepciones;

import com.digitalhouse.obtenerdiploma.dto.ErrorDTO;
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
    public ResponseEntity<ErrorDTO> errorDTO(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(

                new ErrorDTO("Se encontraron los siguientes errores: ",
                        e.getAllErrors().stream().map(error -> error.getDefaultMessage()).collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorDTO> obtenerDiplomaExceptionController(ConstraintViolationException e){
        return ResponseEntity.badRequest().body(

                new ErrorDTO("Se encontraron los siguientes errores: ",
                        e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())
                )
        );
    }
}
