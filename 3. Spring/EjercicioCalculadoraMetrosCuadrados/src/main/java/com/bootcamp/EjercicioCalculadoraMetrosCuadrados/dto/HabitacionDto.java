package com.bootcamp.EjercicioCalculadoraMetrosCuadrados.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class HabitacionDto  {
    private String nombre;
    private double largo;
    private double ancho;

    public double cantidadM2() {
        return this.ancho * this.largo;
    }
}
