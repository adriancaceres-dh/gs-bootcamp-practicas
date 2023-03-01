package com.ejercicioConstructora.Constructora.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropiedadDto {
    private String nombre;
    private String direccion;
    private List<HabitacionesDto> habitaciones = new ArrayList<>();

    @Override
    public String toString() {
        return habitaciones.toString();
    }
}
