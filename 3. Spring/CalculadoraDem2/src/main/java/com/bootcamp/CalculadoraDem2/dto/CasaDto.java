package com.bootcamp.CalculadoraDem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CasaDto {
    private String nombre;
    private String direccion;

    private List<HabitacionDto> habitaciones;


}
