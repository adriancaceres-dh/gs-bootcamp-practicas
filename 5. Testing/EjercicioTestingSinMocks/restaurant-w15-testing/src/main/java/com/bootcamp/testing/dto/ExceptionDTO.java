package com.bootcamp.testing.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExceptionDTO {
    private String exception;
    private HttpStatus status;
    private String messageException;
}
