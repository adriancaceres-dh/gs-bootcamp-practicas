package com.glubits.repasoJPA.dto;

import lombok.*;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DuenioDTO {

    private Integer id;

    private String nombre;

    private String email;

    private String telefono;

    private Short edad;

    private LocalDate fechaNacimiento;
}
