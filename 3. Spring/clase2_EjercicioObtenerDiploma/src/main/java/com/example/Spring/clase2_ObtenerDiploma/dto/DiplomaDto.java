package com.example.Spring.clase2_ObtenerDiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiplomaDto {
    private String mensaje;
    private Double promedio;
    private AlumnoDto alumno;
}
