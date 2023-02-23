//Ejercicio 5

package Distribuidora;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
            List<Producto> productos = new ArrayList<>();
            Producto producto1= new Perecedero("Arroz", 30);
            Producto producto2= new Producto("Leche", 50);

            productos.add(producto1);
            productos.add(producto2);

        double total = 0;
        for (Producto producto: productos) {
            total += producto.Calcular(5);
        }
        System.out.println("El total es " + total);
    }
}