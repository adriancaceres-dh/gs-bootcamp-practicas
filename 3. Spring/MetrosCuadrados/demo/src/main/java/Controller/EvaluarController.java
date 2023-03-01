package Controller;//package com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.controller;

import com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO.Propiedad;
import com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO.Response;
import Service.Calculos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluarController {
    @PostMapping("/casa")
    public Response datos(@RequestBody Propiedad casa){
        Calculos calculos = new Calculos();
        Response response = new Response();

        response.setPrecio(calculos.calcularValor(casa));
        response.setHabGrande(calculos.habMasGrande(casa));
        response.setMtsCuadrados(calculos.calcularMtsCuadrados(casa));
        response.setHabitaciones(casa.getHabitaciones());


        return response;
    }

}