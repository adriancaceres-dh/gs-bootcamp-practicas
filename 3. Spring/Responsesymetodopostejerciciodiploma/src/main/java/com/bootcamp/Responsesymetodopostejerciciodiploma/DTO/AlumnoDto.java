package com.bootcamp.Responsesymetodopostejerciciodiploma.DTO;

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
    private List<MateriaDto> materias = new ArrayList<>();
}

