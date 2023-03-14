package com.bootcamp.obtenerDiploma.Models;

import com.bootcamp.obtenerDiploma.Dto.MateriaDto;
import com.bootcamp.obtenerDiploma.Repository.Materia;
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
