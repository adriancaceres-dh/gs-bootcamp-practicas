package com.Sprint1.Sprint1.exception;

import com.Sprint1.Sprint1.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionDto> handlerRuntime(RuntimeException exception){

        ExceptionDto mensaje = new ExceptionDto(exception.getMessage());

        return new ResponseEntity<>(mensaje, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ExceptionDto> handleBadRequestException(HttpMessageNotReadableException ex) {

        ExceptionDto mensaje = new ExceptionDto("Datos ingresados incorrectos.");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensaje);
    }
}
