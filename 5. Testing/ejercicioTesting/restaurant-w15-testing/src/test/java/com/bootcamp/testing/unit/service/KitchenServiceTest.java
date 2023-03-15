package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.bootcamp.testing.repository.interfaces.IStorehouseRepository;
import com.bootcamp.testing.service.KitchenService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

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
        // arrenge
        List<RecipeDTO> expected = new ArrayList<>();

        //act
        var result = kitchenService.getDishes();

        //assert

        Assertions.assertEquals(expected, result);

    }
}
