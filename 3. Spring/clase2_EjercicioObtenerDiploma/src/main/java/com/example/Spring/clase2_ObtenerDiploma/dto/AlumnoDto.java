package com.example.Spring.clase2_ObtenerDiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoDto {
    private String nombre;
    private List<AsignaturaDto> asignaturasAprobadas = new ArrayList<>();
}
