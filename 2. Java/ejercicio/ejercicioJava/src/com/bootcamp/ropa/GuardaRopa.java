package com.bootcamp.ropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int contador = 10;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();

    public Integer guardarPrenda (List<Prenda> listaPrendas){
        contador++;
        prendas.put(contador, listaPrendas);
        return contador;
    }

    public void mostrarPrenda(Integer id) {
        System.out.println(prendas.get(id));
    }
}
