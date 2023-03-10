package com.diploma.entregaDiploma.models;

import com.diploma.entregaDiploma.dto.MateriasDto;
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
    private List<MateriasDto> materias = new ArrayList<>();
}
