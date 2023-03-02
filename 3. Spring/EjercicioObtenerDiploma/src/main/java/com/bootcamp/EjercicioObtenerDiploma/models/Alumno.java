package com.bootcamp.EjercicioObtenerDiploma.models;

import com.bootcamp.EjercicioObtenerDiploma.dto.MateriaDto;
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

    List<Materia> materias = new ArrayList<>();

}
