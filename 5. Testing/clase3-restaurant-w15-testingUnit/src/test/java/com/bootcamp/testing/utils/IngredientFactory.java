package com.bootcamp.testing.utils;

import com.bootcamp.testing.model.Ingredient;

public class IngredientFactory {

    public static Ingredient getBread(){
        return Ingredient.builder().name("bread")
                .quality(1)
                .calories(320)
                .build();
    }

}
