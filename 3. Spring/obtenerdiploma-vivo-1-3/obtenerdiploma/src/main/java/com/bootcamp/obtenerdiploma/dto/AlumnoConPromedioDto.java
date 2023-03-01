package com.bootcamp.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoConPromedioDto {
    private String nombre;
    private Double promedio;

}
