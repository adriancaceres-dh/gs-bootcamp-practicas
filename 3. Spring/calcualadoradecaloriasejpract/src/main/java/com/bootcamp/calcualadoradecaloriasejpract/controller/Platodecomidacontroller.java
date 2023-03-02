package com.bootcamp.calcualadoradecaloriasejpract.controller;

import com.bootcamp.calcualadoradecaloriasejpract.DTO.Platodto;
import com.bootcamp.calcualadoradecaloriasejpract.service.Platoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Platodecomidacontroller {
    @Autowired
    Platoservice platoservice;
    @GetMapping("/listarplatos")
    public List<String> listarplatos(){
        return platoservice.getplatos();


    }
    @PostMapping("/agregarplato")
    public String agregarPlato(Platodto platodto){
        return "Plato" + platodto;
    }

}
