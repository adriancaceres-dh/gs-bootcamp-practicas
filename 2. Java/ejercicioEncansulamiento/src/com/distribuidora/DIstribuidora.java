package com.distribuidora;

import java.util.ArrayList;
import java.util.List;

public class DIstribuidora {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Perecedero("Leche", 100, 1 );
        Producto producto2 = new NoPerecederos("Arbejas", 150, "Enlatado");

        productos.add(producto1);
        productos.add(producto2);

        System.out.println(precioFinal(productos));
    }
    public static double precioFinal(List<Producto> e) {
    double result = 0;
        for(Producto productos: e){
       result = result + productos.calcular(5);
    }
        return result;

    }

}