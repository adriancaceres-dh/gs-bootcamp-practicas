package com.BootcampDH.Obtener.Diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data //dependencia para crear getters and setters y constructores
public class AlumnoDto {

    //atributos: cada alumno tiene su nombre y una lista de materias aprobadas
    private String nombre;
    private List<MateriaDto> materiasAprobadas = new ArrayList<>();
}
