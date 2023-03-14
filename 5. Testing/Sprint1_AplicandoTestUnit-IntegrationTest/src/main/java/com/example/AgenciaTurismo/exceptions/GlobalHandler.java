package com.example.AgenciaTurismo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(RuntimeException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<String> handlerRuntime(RuntimeException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(SinHotelesException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<String> SinHotelesException(SinHotelesException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(VuelosException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<String> VuelosException(VuelosException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(CapacidadMaximaException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<String> CapacidadMaximaException(CapacidadMaximaException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);

    }
}

