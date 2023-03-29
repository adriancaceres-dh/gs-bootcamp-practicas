package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.repository.StorehouseRepository;
import com.bootcamp.testing.utils.IngredientFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StorehouseRepositoryTest {

    StorehouseRepository storehouseRepository = new StorehouseRepository();

    @Test
    public void getIngredients(){
        // arrange
        String name = "bread";
        Optional<Ingredient> expected = Optional.of(IngredientFactory.getBread());

        // act
        var result = storehouseRepository.getIngredient(name);

        // assert
        Assertions.assertEquals(expected,result);
    }
}
