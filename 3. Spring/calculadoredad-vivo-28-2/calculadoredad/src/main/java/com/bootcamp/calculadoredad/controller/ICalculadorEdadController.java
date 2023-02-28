package com.bootcamp.calculadoredad.controller;

import org.springframework.web.bind.annotation.PathVariable;

public interface ICalculadorEdadController {
    public Integer obtenerEdad(Integer dia, Integer mes, Integer anio) ;
}
