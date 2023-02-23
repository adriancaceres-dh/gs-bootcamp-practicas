import java.util.*;
public class Distribuidora {
    public static void main(String[] args) {

        Producto[] productos = new Producto[5];

        productos[0] = new Producto("Alfajor", 100);
        productos[1] = new Perecederos("Chocolate", 250, 1);
        productos[2] = new Perecederos("Coca-Cola", 380, 5);
        productos[3] = new Perecederos("Dulce de leche", 560, 3);
        productos[4] = new NoPerecederos("Arroz", 440, "tipoA");

        for(Producto producto : productos ){
            double precioTotal = producto.Calcular(5);
            System.out.println("El total vendido por "+ producto.getNombre() + " es $" + precioTotal);
        }
    }
}