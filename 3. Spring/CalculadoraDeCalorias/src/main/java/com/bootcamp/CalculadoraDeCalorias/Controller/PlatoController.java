package com.bootcamp.CalculadoraDeCalorias.Controller;

import com.bootcamp.CalculadoraDeCalorias.Dto.ComidaDto;
import com.bootcamp.CalculadoraDeCalorias.Service.PlatoService;
import com.bootcamp.CalculadoraDeCalorias.Service.PlatoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlatoController {
    @Autowired
    PlatoService platoService;
    @PostMapping("/ingrediente")
    public ResponseEntity<String> caloriasTotales (@RequestBody ComidaDto comidaDto){
        return  new ResponseEntity<>(platoService.caloriasTotales(comidaDto), HttpStatus.ACCEPTED);
    }

    @PostMapping("/calorias")
    public ResponseEntity<String> caloriasIngrediente (@RequestBody ComidaDto comidaDto){
        return  new ResponseEntity<>(platoService.caloriasIngrediente(comidaDto), HttpStatus.ACCEPTED);
    }

}
