package com.bootcamp.metrosCuadrados.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class HabitacionDto {
    private String nombre;
    private double ancho;
    private double largo;

    public double calcularArea() {
        return ancho * largo;
    }
}
