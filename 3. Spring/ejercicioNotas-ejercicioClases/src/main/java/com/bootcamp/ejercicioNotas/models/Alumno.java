package com.bootcamp.ejercicioNotas.models;

import com.bootcamp.ejercicioNotas.dto.MateriaDto;
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
