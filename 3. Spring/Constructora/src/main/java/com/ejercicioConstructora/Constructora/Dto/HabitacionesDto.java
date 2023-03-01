package com.ejercicioConstructora.Constructora.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionesDto {
    private String nombre;
    private double ancho;
    private double largo;

    @Override
    public String toString() {
        return "\nNombre de la habitacion: " + nombre + " - Cantidad de metros cuadrados:" + ancho*largo +"\n";
    }
}
