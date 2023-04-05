package com.concesionario.ford.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

    private Integer id;

    private String nombre;

    private String email;

    private String telefono;

    private Integer edad;

    private LocalDate fechaDeNacimiento;
}

