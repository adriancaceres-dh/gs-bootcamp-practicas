package com.bootcamp.DTOResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class Plato {
    private String nombre;
    private List<Ingrediente> ingredientes;

    // constructor, getters y setters

    public int calcularCaloriasTotales() {
        int caloriasTotales = 0;
        for (Ingrediente ingrediente : ingredientes) {
            caloriasTotales += ingrediente.calcularCalorias();
        }
        return caloriasTotales;
    }

    public Map<String, Integer> calcularCaloriasPorIngrediente() {
        Map<String, Integer> caloriasPorIngrediente = new HashMap<>();
        for (Ingrediente ingrediente : ingredientes) {
            caloriasPorIngrediente.put(ingrediente.getNombre(), ingrediente.calcularCalorias());
        }
        return caloriasPorIngrediente;
    }

    public String obtenerIngredienteConMasCalorias() {
        Ingrediente ingredienteConMasCalorias = null;
        for (Ingrediente ingrediente : ingredientes) {
            if (ingredienteConMasCalorias == null || ingrediente.calcularCalorias() > ingredienteConMasCalorias.calcularCalorias()) {
                ingredienteConMasCalorias = ingrediente;
            }
        }
        return ingredienteConMasCalorias != null ? ingredienteConMasCalorias.getNombre() : null;
    }

}
