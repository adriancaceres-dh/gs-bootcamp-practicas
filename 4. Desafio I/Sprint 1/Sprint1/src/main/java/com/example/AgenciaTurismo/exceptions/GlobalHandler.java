package com.example.AgenciaTurismo.exceptions;

import com.example.AgenciaTurismo.dto.ErrorDTO;
import com.example.AgenciaTurismo.dto.ErrorMessageDTO;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.time.format.DateTimeParseException;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(InvalidFormatException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<ErrorMessageDTO> parametrosError(InvalidFormatException e) {
        ErrorMessageDTO errorMessageDTO = new ErrorMessageDTO();
        errorMessageDTO.setName("Formato de fecha invalido");
        errorMessageDTO.setMessage("Formato de fecha debe ser dd/mm/aaaa");
        return new ResponseEntity<>(errorMessageDTO, HttpStatus.BAD_REQUEST);
    }

     @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<ErrorMessageDTO> parametrosError(MethodArgumentTypeMismatchException e) {
        ErrorMessageDTO errorMessageDTO = new ErrorMessageDTO();
        errorMessageDTO.setName("Formato de fecha invalido");
        errorMessageDTO.setMessage("Formato de fecha debe ser dd/mm/aaaa");
        return new ResponseEntity<>(errorMessageDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SinHotelesException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<ErrorMessageDTO> parametrosError(SinHotelesException e) {
        ErrorMessageDTO errorMessageDTO = new ErrorMessageDTO();
        errorMessageDTO.setName("Validación en hoteles.");
        errorMessageDTO.setMessage(e.getMessage());
        return new ResponseEntity<>(errorMessageDTO, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(VuelosException.class)
    //Spring sabe que si sale una exception de este tipo, se ejecuta el metodo abajo.
    public ResponseEntity<ErrorMessageDTO> parametrosError(VuelosException e) {
        ErrorMessageDTO errorMessageDTO = new ErrorMessageDTO();
        errorMessageDTO.setName("Validación en vuelos.");
        errorMessageDTO.setMessage(e.getMessage());
        return new ResponseEntity<>(errorMessageDTO, HttpStatus.BAD_REQUEST);
    }

    // AMBOS METODOS SIRVEN PARA CONVERTIR LOS MENSAJES DE LAS VALIDACIONES EN UN ARRAY DE MENSAJES ENTENDIBLES.

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> validationException(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(
                new ErrorDTO("Se encontraron los siguientes errores en las validaciones: ",
                        e.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorDTO> validationException(ConstraintViolationException e){
        return ResponseEntity.badRequest().body(
                new ErrorDTO("Se encontraron los siguientes errores en las validaciones: ",
                        e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())
                )
        );
    }
}

