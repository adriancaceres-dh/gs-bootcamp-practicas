package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.dto.RecipeDTO;
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

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class KitchenServiseTest {

    @Mock
    IRecipeRepository recipeRepository;
    @Mock
    IStorehouseRepository storehouseRepository;

    @InjectMocks
    KitchenService kitchenService;

    @Test
    public void getDishesTest(){
        //arrenge
        List<RecipeDTO> expected = List.of(RecipeDTOFactory.getBurgerDTO());
        List<Recipe> deberiaRetornar = List.of(RecipeFactory.getBurger());

        Mockito.when(recipeRepository.getRecipes()).thenReturn(deberiaRetornar);
        //act
        var result = kitchenService.getDishes();

        //Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void createDishTest(){

        //arrenge
        String name = "burger";
        RecipeDTO expected = RecipeDTOFactory.getBurgerDTO();
        Optional<Recipe> burger = Optional.of(RecipeFactory.getBurger());

        //act
        Mockito.when(recipeRepository.getRecipe(name)).thenReturn(burger);

        var result = kitchenService.createDish(name);


        //assert

        Assertions.assertEquals(expected, result);


    }


}
