package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice//Le indicamos a spring que con esta clase captura las exceptions
public class GlobalHandler {

    //@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Lo hiciste aca Sergio")
    @ExceptionHandler(RuntimeException.class)//Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<String> handlerRuntime(RuntimeException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<String> handlerNoSouc(NoSuchFieldException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }


}
