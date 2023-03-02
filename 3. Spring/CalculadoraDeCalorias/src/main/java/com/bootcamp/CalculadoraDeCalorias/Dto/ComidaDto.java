package com.bootcamp.CalculadoraDeCalorias.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComidaDto {
    private String nombre;

    private List<IngredientesDto> ingredientes = new ArrayList<>();
}
