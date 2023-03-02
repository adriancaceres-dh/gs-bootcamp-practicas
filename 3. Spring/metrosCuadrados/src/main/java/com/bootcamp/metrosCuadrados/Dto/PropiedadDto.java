package com.bootcamp.metrosCuadrados.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PropiedadDto {
    private String nombre;
    private String direccion;
    private List<HabitacionDto> habitaciones = new ArrayList<>();

}
