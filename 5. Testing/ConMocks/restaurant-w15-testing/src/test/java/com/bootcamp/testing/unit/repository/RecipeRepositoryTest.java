package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.exception.notfound.RecipeNotFoundException;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// TODO: TESTING UNITARIO SIN MOCKS

public class RecipeRepositoryTest {

    RecipeRepository recipeRepository = new RecipeRepository();

    @Test
    @DisplayName("Test que verifica que se obtienen todos los objetos de la lista esperados")
    public void getRecipesTest(){
        // arrange - ordenar y crear los datos necesarios
        List<Recipe> expected = new ArrayList<>();
        Recipe burger = RecipeFactory.getBurger();

        expected.add(burger);

        // act - correr el metodo que corresponde
        var result = recipeRepository.getRecipes();

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertEquals(expected, result);

    }

    // Verifica que la lista recibida tienen la misma cantidad de objetos que yo espero
    @Test
    public void getRecipesMatchItemsQuantityTest(){
        // arrange - ordenar y crear los datos necesarios
        Integer expected = 1;

        // act - correr el metodo que corresponde
        var result = recipeRepository.getRecipes();

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertEquals(expected, result.size());

    }

    @Test
    public void getRecipeByName(){
        // arrange
        String name = "burger" ;
        Optional<Recipe> expected = Optional.of(RecipeFactory.getBurger());

        // act
        var result = recipeRepository.getRecipe(name);

        // assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getRecipeByNotExistentName(){
        // arrange
        String name = "not burger" ;

        // act && assert -- cuando trabajo con excepciones, act y assert se unen

        Assertions.assertThrows(RecipeNotFoundException.class,
                () -> recipeRepository.getRecipe(name));
    }

    @Test
    // Este test esta pobremente codificado -- REFACTORIZAR
    public void addRecipeTest(){
        // arrange
        Recipe notBurger = RecipeFactory.getNotBurger();

        Recipe expected = RecipeFactory.getNotBurger();

        // act
        var result = recipeRepository.createRecipe(notBurger);

        // assert
        Assertions.assertEquals(expected, result);
    }
}
