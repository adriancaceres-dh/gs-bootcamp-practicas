package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.bootcamp.testing.repository.interfaces.IStorehouseRepository;
import com.bootcamp.testing.service.IKitchenService;
import com.bootcamp.testing.service.KitchenService;
import com.bootcamp.testing.utils.RecipeDTOFactory;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class KitchenServiceTest {

    @Mock
    IRecipeRepository recipeRepository;

    @Mock
    IStorehouseRepository storehouseRepository;

    @InjectMocks
    KitchenService kitchenService;


    @Test
    public void getDishesTest(){
        // arrange
        List<RecipeDTO> expected = List.of(RecipeDTOFactory.getBurgerDTO());
        List<Recipe> shouldReturn = List.of(RecipeFactory.getBurger());

        // act
        Mockito.when(recipeRepository.getRecipes()).thenReturn(shouldReturn);

        var result = kitchenService.getDishes();

        // assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void createDishTest(){

        // arrange
        String name = "burger";
        RecipeDTO expected = RecipeDTOFactory.getBurgerWithQualityAndCaloriesDTO();
        Optional<Recipe> burger = Optional.of(RecipeFactory.getBurger());
        Optional<Ingredient> bread = Optional.of(RecipeFactory.getBread());
        Optional<Ingredient> meal = Optional.of(RecipeFactory.getMeal());
        // act

        Mockito.when(recipeRepository.getRecipe("burger")).thenReturn(burger);
        Mockito.when(storehouseRepository.getIngredient("bread")).thenReturn(bread);
        Mockito.when(storehouseRepository.getIngredient("meal")).thenReturn(meal);

        var result = kitchenService.createDish(name);

        // assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void createRecipeTest(){
        // arrange
        // parametros requeridos
        RecipeDTO recipeDTOParam = RecipeDTOFactory.getNotBurgerDTO();
        Recipe recipeEntityParam = RecipeFactory.getNotBurger();
        // lo que deberia devolverse
        RecipeDTO expected = RecipeDTOFactory.getNotBurgerDTO();

        // act
        Mockito.when(recipeRepository.createRecipe(recipeEntityParam)).thenReturn(recipeEntityParam);
        var result = kitchenService.createRecipe(recipeDTOParam);

        // assert
        Assertions.assertEquals(expected, result);

    }
}
