package com.bootcamp.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionDtoMetros {
    private HabitacionDto habitacionDto;
    private Double metrosCuadrados;
}
