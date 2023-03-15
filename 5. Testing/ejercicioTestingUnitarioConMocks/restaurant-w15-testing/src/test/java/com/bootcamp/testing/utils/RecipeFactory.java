package com.bootcamp.testing.utils;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;

import java.util.List;

public class RecipeFactory {

    public static Recipe getBurger(){
        return Recipe.builder().name("burger")
                .description("lorem ipsum")
                .ingredients(
                        List.of(
                                getBread(),
                                getMeal()
                        )
                )
                .build();
    }

    public static Recipe getNotBurger(){
        return Recipe.builder().name("not burger")
                .description("lorem ipsum")
                .ingredients(
                        List.of(
                                getBread(),
                                getSecretNotIngredient()
                        )
                )
                .build();
    }
    public static Ingredient getBread(){
        return Ingredient.builder()
                .name("bread")
                .quantity(1)
                .quality(4)
                .calories(300)
                .build();
    }

    public static Ingredient getMeal(){
        return Ingredient.builder()
                .name("meal")
                .quantity(2)
                .quality(5)
                .calories(500)
                .build();
    }

    public static Ingredient getSecretNotIngredient(){
        return Ingredient.builder()
                .name("NotMeat")
                .quantity(2)
                .build();
    }

}
