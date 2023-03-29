package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.exception.notfound.RecipeNotFoundException;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecipeRepositoryTest {

    RecipeRepository recipeRepository = new RecipeRepository();

    @Test
    @DisplayName("Test que verifica que se obtienen todos los objetos de la lista esperados")
    public void getRecipesTest(){
        // arrange - Ordenar y crear datos necesarios (parámetros y metodos de devolución);
        List<Recipe> expected = List.of(RecipeFactory.getBurger()); //Genero en el factory mis objetos de respuesta para compararlos con los que deberia devolver el metodo del repo.

        // act - corremos el metodo
        var result = recipeRepository.getRecipes();

        //assert - fijarnos si es verdadero o falso.
        Assertions.assertEquals(expected,result);

    }

    //Verifica que la lista recibida o retornada tiene la misma cantidad d eobjetos que yo espero.
    @Test
    public void getRecipesMatchItemsQuantityTest(){
        // arrange - Ordenar y crear datos necesarios (parámetros y metodos de devolución);
        Integer expected = 1;

        // act - corremos el metodo
        var result = recipeRepository.getRecipes();

        //assert - fijarnos si es verdadero o falso.
        Assertions.assertEquals(expected,result.size());

    }

    @Test
    public void getRecipeByName(){
        // arrange
        String name = "burger";
        Optional<Recipe> expected = Optional.of(RecipeFactory.getBurger());

        // act
        var result = recipeRepository.getRecipe(name);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void getRecipeByNotExistantName(){
        // arrange
        String name = "not burger";

        // act && assert -- Cuando trabajo con exception se unen
        Assertions.assertThrows(RecipeNotFoundException.class,
                ()-> recipeRepository.getRecipe(name));
    }

    @Test
    @DisplayName("Test que devuelve objeto a agregar a la lista")
    //Test pobremente codificado -- REFACTORIZAR
    public void addRecipes(){
        // arrange
        Recipe notBurger = RecipeFactory.getNotBurger();
        Recipe expected = RecipeFactory.getNotBurger();

        // act
        var result = recipeRepository.createRecipe(notBurger);

        // assert
        Assertions.assertEquals(expected,result);
    }
}
