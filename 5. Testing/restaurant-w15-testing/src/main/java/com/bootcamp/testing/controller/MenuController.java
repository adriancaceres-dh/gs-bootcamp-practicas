package com.bootcamp.testing.controller;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.service.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    IKitchenService kitchenService;

    @Autowired
    public MenuController ( IKitchenService kitchenService ) {
        this.kitchenService = kitchenService;
    }

    @GetMapping
    public ResponseEntity<List<RecipeDTO>> listDish(){
        return ResponseEntity.ok(
                kitchenService.getDishes()
        );
    }

    @PostMapping("/dish")
    public ResponseEntity<RecipeDTO> createDish(@RequestParam String name){
        return
                ResponseEntity.ok(
                        kitchenService.createDish(name)
        );
    }

}