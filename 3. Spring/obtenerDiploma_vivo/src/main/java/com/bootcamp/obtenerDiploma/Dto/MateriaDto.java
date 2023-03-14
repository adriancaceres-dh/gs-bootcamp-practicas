package com.bootcamp.obtenerDiploma.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaDto {
    private String nombre;
    private Double nota;
}
