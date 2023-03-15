package com.glubits.employees.exception;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.ValidationDTO;
import com.glubits.employees.utils.enums.CrudEnum;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    // AMBOS METODOS SIRVEN PARA CONVERTIR LOS MENSAJES DE LAS VALIDACIONES EN UN ARRAY DE MENSAJES ENTENDIBLES.

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationDTO> validationException(MethodArgumentNotValidException e){
        return ResponseEntity.ok(
                new ValidationDTO(
                        e.getAllErrors().stream().map(error -> error.getDefaultMessage()).collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ValidationDTO> validationException(ConstraintViolationException e){
        return ResponseEntity.ok(
                new ValidationDTO(
                        e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())
                )
        );
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CrudDTO> crudErrorException(NotFoundException e){
        return ResponseEntity.status(404).body(
                CrudDTO.builder()
                        .message(e.getMessage())
                        .action(e.action)
                        .build()
        );
    }

    @ExceptionHandler(CouldNotDeleteException.class)
    public ResponseEntity<CrudDTO> crudErrorException(CouldNotDeleteException e){
        return ResponseEntity.ok(
                CrudDTO.builder()
                        .message(e.getMessage())
                        .action(CrudEnum.DELETATION)
                        .build()
        );
    }
}
