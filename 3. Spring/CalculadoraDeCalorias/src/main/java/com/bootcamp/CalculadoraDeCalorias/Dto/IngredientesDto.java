package com.bootcamp.CalculadoraDeCalorias.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientesDto {
    private String nombre;
    private int calorias;
}
