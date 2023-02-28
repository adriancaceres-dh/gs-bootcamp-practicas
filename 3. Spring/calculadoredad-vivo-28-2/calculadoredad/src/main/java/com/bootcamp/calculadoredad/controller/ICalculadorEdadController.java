package com.bootcamp.calculadoredad.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface ICalculadorEdadController {
    public Integer obtenerEdad(Integer dia, Integer mes, Integer anio) ;
    public Integer obtenerEdadPorUrlGet(Integer dia, Integer mes, Integer anio);
}
