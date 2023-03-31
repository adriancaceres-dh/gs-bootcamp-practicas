//package com.example.demo.exceptions;
//
////import org.springframework.web.bind.annotation.ControllerAdvice;
////import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import org.springframework.data.crossstore.ChangeSetPersister;
//
//@ControllerAdvicer
//public class GlobalExceptionHandler {
//    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
//    public ResponseEntity<MessageDTO> notFoundException(NotFoundException e){
//        return ResponseEntity.status(404).body(
//                MessageDTO.builder()
//                        .message(e.getMessage())
//                        .action("Check")
//                        .build()
//        );
//    }
//}
