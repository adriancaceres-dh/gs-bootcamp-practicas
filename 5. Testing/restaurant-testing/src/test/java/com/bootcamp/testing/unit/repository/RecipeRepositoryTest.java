package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecipeRepositoryTest {

    RecipeRepository recipeRepository = new RecipeRepository();

    @Test
    @DisplayName("Test que verifica si se obtienen los productos de la lista")
    public void getRecipesTest(){
        // Arrange - ordenar y crear los datos necesarios
        List<Recipe> expected = new ArrayList<>();
        Recipe burger = RecipeFactory.getBurger();

        expected.add(burger);

        // Act - correr el método que corresponde
        var result = recipeRepository.getRecipes();
        System.out.println(result);

        // Assert - fijarnos si es verdadero o falso
        Assertions.assertEquals(expected, result);

    }

    // Verifica que la lista recibida tiene la misma cantidad de objetos que yo espero
    @Test
    public void getRecipesMatchItemsQuantityTest(){
        // Arrange - ordenar y crear los datos necesarios
        Integer expected = 1;

        // Act - correr el método que corresponde
        var result = recipeRepository.getRecipes();
        System.out.println(result);

        // Assert - fijarnos si es verdadero o falso
        Assertions.assertEquals(expected, result.size());
    }

    @Test
    public void getRecipeByName(){
        // Arrange
        String name = "burger" ;
        Optional<Recipe> expected = Optional.of(RecipeFactory.getBurger());

        // Act
        var result = recipeRepository.getRecipe(name);

        // Assert
        Assertions.assertEquals(expected, result);

    }

}
