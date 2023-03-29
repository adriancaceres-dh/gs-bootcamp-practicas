package com.bootcamp.testing.repository;

import com.bootcamp.testing.exception.notfound.RecipeNotFoundException;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class RecipeRepository implements IRecipeRepository {

    List<Recipe> recipes;

    public RecipeRepository () {
        loadDataBase();
    }

    @Override
    public List<Recipe> getRecipes () {
        return recipes;
    }

    @Override
    public Optional<Recipe> getRecipe ( String name ) {
        var recipe = recipes.stream()
          .filter(r -> r.hasSameName(name))
          .findFirst();

        recipe.orElseThrow(()-> {
            throw new RecipeNotFoundException("No se pudo encontrar la receta "+name);
        });

        return recipe;
    }

    @Override
    public Recipe createRecipe ( Recipe recipe ) {
        this.recipes.add(recipe);
        return recipe;
    }

    private void loadDataBase () {
        File                        file;
        ObjectMapper                objectMapper = new ObjectMapper();
        TypeReference<List<Recipe>> typeRef      = new TypeReference<>() {
        };

        try {
            file    = ResourceUtils.getFile("classpath:recipes.json");
            recipes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
