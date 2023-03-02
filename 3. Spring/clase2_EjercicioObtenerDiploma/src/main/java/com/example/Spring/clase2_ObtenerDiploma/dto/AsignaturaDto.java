package com.example.Spring.clase2_ObtenerDiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AsignaturaDto {
    private String nombre;
    private Double nota;
}
