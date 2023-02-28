package com.bootcamp.numerosRomanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomano {
    @GetMapping("/{numeroRomano}")
    public String decodificarNumeroRomano(@PathVariable String numeroRomano) {
        int resultado = 0;
        for (int i = 0; i < numeroRomano.length(); i++) {
            // obtener el valor del símbolo romano actual
            int valorActual = obtenerValorRomano(numeroRomano.charAt(i));
            // si el valor del símbolo siguiente es mayor, restar el valor actual
            if (i + 1 < numeroRomano.length() && obtenerValorRomano(numeroRomano.charAt(i + 1)) > valorActual) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }
        }
        return "El número romano " + numeroRomano + " equivale a " + resultado + " en decimal.";
    }

    private int obtenerValorRomano(char simbolo) {
        switch (simbolo) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Símbolo romano inválido: " + simbolo);
        }
    }
}
