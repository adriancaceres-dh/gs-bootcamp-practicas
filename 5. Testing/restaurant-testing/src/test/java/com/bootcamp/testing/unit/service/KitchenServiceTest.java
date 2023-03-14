package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.bootcamp.testing.repository.interfaces.IStorehouseRepository;
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
    public void getDishesTest (){
        // Arrange
        List<RecipeDTO> expected = List.of(RecipeDTOFactory.getBurgerDTO());
        List<Recipe> shouldReturn = List.of(RecipeFactory.getBurger());
        // Act
        Mockito.when(recipeRepository.getRecipes()).thenReturn(shouldReturn);

        var result = kitchenService.getDishes();

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void createDishTest(){
        // Arrange
        String name = "burger";
        RecipeDTO expected = RecipeDTOFactory.getBurgerDTO();
        Optional<Recipe> burger = Optional.of(RecipeFactory.getBurger());
        Optional<Ingredient> bread = Optional.of(RecipeFactory.getBread());
        Optional<Ingredient> meal = Optional.of(RecipeFactory.getMeal());

        // Act
        Mockito.when(recipeRepository.getRecipe("burger")).thenReturn(burger);
        Mockito.when(storehouseRepository.getIngredient("bread")).thenReturn(bread);
        Mockito.when(storehouseRepository.getIngredient("meal")).thenReturn(meal);

        var result = kitchenService.createDish(name);


        // Assert

        Assertions.assertEquals(expected, result);
    }
}
