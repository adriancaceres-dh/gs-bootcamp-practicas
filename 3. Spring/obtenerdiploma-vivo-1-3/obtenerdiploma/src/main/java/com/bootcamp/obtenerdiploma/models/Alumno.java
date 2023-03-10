package com.bootcamp.obtenerdiploma.models;

import com.bootcamp.obtenerdiploma.dto.MateriaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
    private String nombre;
    private List<Materia> materias = new ArrayList<>();

}
