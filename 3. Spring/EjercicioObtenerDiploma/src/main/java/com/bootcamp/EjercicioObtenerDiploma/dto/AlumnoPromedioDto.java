package com.bootcamp.EjercicioObtenerDiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AlumnoPromedioDto {
    private String nombre;
    private Double promedio;

}
