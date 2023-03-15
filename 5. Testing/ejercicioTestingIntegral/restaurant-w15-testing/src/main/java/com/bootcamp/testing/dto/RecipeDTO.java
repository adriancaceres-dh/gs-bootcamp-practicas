package com.bootcamp.testing.dto;

import com.bootcamp.testing.model.Ingredient;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeDTO {

    private String name;
    private String description;
    private List<IngredientDTO> ingredients;
    private Double quality;
    private Double calories;

}
