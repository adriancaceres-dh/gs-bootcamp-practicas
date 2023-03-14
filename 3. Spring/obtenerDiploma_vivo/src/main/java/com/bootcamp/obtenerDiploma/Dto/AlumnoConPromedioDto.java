package com.bootcamp.obtenerDiploma.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoConPromedioDto {

    private String nombre;
    private double promedio;

}
