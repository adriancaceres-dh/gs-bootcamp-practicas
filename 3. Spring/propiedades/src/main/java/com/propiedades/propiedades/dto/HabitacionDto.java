package com.propiedades.propiedades.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionDto {
    private String nombre;
    private double ancho;
    private double largo;

    @Override
    public String toString() {
        return "\n" + "Nombre de la habitacion: " + nombre + " tiene " + ancho * largo + " metros cuadrados." + "\n";
    }
}
