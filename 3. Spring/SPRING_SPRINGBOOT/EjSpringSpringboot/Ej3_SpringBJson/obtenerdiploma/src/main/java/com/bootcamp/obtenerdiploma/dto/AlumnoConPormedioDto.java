package com.bootcamp.obtenerdiploma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoConPormedioDto {
    private String nombre;
    private Double primedio;
}
