package com.bootcamp.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionDto {
    private String nombre;
    private Double ancho;
    private Double largo;
}
