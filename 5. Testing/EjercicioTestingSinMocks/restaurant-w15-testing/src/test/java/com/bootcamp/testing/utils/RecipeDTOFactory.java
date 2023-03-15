package com.bootcamp.testing.utils;

import com.bootcamp.testing.dto.IngredientDTO;
import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;

import java.util.List;

public class RecipeDTOFactory {
    public static RecipeDTO getBurgerDTO(){
        return RecipeDTO.builder().name("burger")
                .description("lorem ipsum")
                .ingredients(
                        List.of(
                                getBreadDTO(),
                                getMealDTO()
                        )
                )
                .build();
    }

    public static RecipeDTO getNotBurgerDTO(){
        return RecipeDTO.builder().name("not burger")
                .description("lorem ipsum")
                .ingredients(
                        List.of(
                                getBreadDTO(),
                                getSecretNotIngredientDTO()
                        )
                )
                .build();
    }

    public static IngredientDTO getBreadDTO(){
        return IngredientDTO.builder()
                .name("bread")
                .quantity(1)
                .build();
    }

    public static IngredientDTO getMealDTO(){
        return IngredientDTO.builder()
                .name("meal")
                .quantity(2)
                .build();
    }

    public static IngredientDTO getSecretNotIngredientDTO(){
        return IngredientDTO.builder()
                .name("NotMeat")
                .quantity(2)
                .build();
    }
}
