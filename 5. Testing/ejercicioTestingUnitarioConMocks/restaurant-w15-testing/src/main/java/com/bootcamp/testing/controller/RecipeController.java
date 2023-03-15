package com.bootcamp.testing.controller;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.bootcamp.testing.service.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    IKitchenService kitchenService;

    @Autowired
    public RecipeController ( IKitchenService kitchenService ) {
        this.kitchenService = kitchenService;
    }

    @PostMapping("")
    public ResponseEntity<RecipeDTO> createRecipe(@RequestBody RecipeDTO recipe){
        return new ResponseEntity<>(kitchenService.createRecipe(recipe), HttpStatus.CREATED);
    }
}
