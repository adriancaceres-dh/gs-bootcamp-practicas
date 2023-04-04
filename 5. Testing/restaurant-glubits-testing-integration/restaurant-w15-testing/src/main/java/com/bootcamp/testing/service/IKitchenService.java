package com.bootcamp.testing.service;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Recipe;

import java.util.List;

public interface IKitchenService {

    List<RecipeDTO> getDishes();

    RecipeDTO createDish(String name);

    RecipeDTO createRecipe(RecipeDTO recipe);
}
