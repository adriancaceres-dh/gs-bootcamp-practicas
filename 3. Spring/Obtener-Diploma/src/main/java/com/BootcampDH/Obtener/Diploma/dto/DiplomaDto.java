package com.BootcampDH.Obtener.Diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DiplomaDto {
    //atributos
    private String mensaje;
    private Double promedio;
    private AlumnoDto alumno; //recibe todos los datos del alumno

}
