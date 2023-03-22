package com.bootcamp.testing.dto;

import com.bootcamp.testing.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RecipeDTO {

    private String name;
    private String description;
    private List<IngredientDTO> ingredients;
    private Double quality;
    private Double calories;

}
