package com.bootcamp.CalculadoraDem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//creamos un Dto Responsive ya que el metodo post debe devolver un objeto con los datos requeridos
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDto {
    private Double m2Propiedad;
    private Double valorPropiedad;
    private HabitacionDto habitacionMasGrande;
    private List<HabitacionDto> habitaciones;

}
