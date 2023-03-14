package com.bootcamp.testing.utils;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;

import java.util.List;

public class RecipeFactory {
    public static Recipe getBurger() {
        return Recipe.builder().name("burger")
                .description("lorem ipsum")
                .ingredients(
                        List.of(getBread(), getMeal()))
                .quality(4.5)
                .calories(6.0)
                .build();
    }

    public static Ingredient getBread() {
        return Ingredient.builder().name("bread")
                .quantity(1)
                .quality(4)
                .calories(200)
                .build();
    }

    public static Ingredient getMeal() {
        return Ingredient.builder().name("meal")
                .quantity(2)
                .quality(5)
                .calories(200)
                .build();
    }
}
