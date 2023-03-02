package com.bootcamp.calcualadoradecaloriasejpract.controller;

import com.bootcamp.calcualadoradecaloriasejpract.service.Ingredientesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Ingredientescontroller {
    @Autowired
    Ingredientesservice ingredientesservice;

    @GetMapping("/ingredientes")
    public List<String> getingredientes(){
        return ingredientesservice.getingrediente();
    }

}
