package com.bootcamp.CalculadoraDem2.controller;

import com.bootcamp.CalculadoraDem2.dto.CasaDto;
import com.bootcamp.CalculadoraDem2.dto.ResponseDto;
import com.bootcamp.CalculadoraDem2.servicios.Calculos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasaController {

    @PostMapping("/casa")
    public ResponseDto datosCasa (@RequestBody CasaDto casa){
        Calculos calculos = new Calculos();
        ResponseDto response = new ResponseDto();

        response.setM2Propiedad(calculos.calculoM2Casa(casa));
        response.setValorPropiedad(calculos.valorPropiedad(casa));
        response.setHabitacionMasGrande(calculos.habitacionMasGrande(casa));
        response.setHabitaciones(casa.getHabitaciones());

        return response;
    }
}
