package com.bootcamp.ropa;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSaveTheRopa {

    public static void main(String[] args) {
        Prenda prenda = new Prenda("marca1", "AA2");
        Prenda prenda1 = new Prenda("marca5", "EE2");

        List<Prenda> prendas = new ArrayList<>();

        prendas.add(prenda);
        prendas.add(prenda1);

        GuardaRopa guardaRopa = new GuardaRopa();

        Integer id = guardaRopa.guardarPrenda(prendas);

        System.out.println(id);
        guardaRopa.mostrarPrenda(id);
    }
}
