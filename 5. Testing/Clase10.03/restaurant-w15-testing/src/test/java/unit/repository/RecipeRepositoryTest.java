package unit.repository;

import com.bootcamp.testing.exception.notfound.RecipeNotFoundException;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.RecipeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecipeRepositoryTest {

    RecipeRepository recipeRepository = new RecipeRepository(); //<--- debo instanciarlo para correr el metodo en el act


    @Test
    @DisplayName("Test que verifica que se obtiene todos los objetos de la lista esperados")
    public void getRecipesTest() {
        //arrange - ordenar y crear los datos necesarios
        List<Recipe> expected = new ArrayList<>();
        Recipe burger = RecipeFactory.getBurger(); // lo llama desde utils - RecipeFactory

        expected.add(burger);

        //act - correr el metodo que corresponde
        var result = recipeRepository.getRecipes();
        System.out.println(result);

        //assert - fijarnos si es verdadero o falso el assertion
        Assertions.assertEquals(expected, result);

    }
//Verifica que la lista recibida tienen la misma cantidad de objetos que se esperaba
    @Test
    public void getRecipesMatchItemsQuantityTest() {
        //arrange - ordenar y crear los datos necesarios
        Integer expected = 1;

        //act - correr el metodo que corresponde
        var result = recipeRepository.getRecipes();


        //assert - fijarnos si es verdadero o falso el assertion
        Assertions.assertEquals(expected, result.size());

    }

    @Test
    public void getRecipeByName(){
        //arrange
        String name = "burger";
        Optional<Recipe> expected = Optional.of(RecipeFactory.getBurger());

        //act
        var result = recipeRepository.getRecipe(name);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getRecipeByNotExistentName(){
        //arrange
        String name = "not burger";


        //act && assert -- cuando trabajo con excepciones, act y assert se unen

        Assertions.assertThrows(RecipeNotFoundException.class,
                () -> recipeRepository.getRecipe(name));
    }

    @Test
    //Este test esta pobremente codificado -- refactorizar
    public void addRecipeTest(){
        // arrange
        Recipe notBurger = RecipeFactory.getNotBurger();

        Recipe expected = RecipeFactory.getNotBurger();

        //act
        var result = recipeRepository.createRecipe(notBurger);

        //assert
        Assertions.assertEquals(expected, result);

    }

}
