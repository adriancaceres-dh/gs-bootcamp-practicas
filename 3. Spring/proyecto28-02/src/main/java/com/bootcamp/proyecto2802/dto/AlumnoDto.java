package com.bootcamp.proyecto2802.dto;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
public class AlumnoDto {
    private String nombre;
    private List<MateriaDto> materias = new ArrayList<>();
}
