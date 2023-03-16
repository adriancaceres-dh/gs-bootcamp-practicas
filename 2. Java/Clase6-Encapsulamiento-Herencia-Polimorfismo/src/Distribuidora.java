import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("Alfajor", 100);
        productos[1] = new Producto("Dulce de Leche", 600);
        productos[2] = new Producto("Azúcar", 200);
        productos[3] = new Producto("Yerba", 1000);
        productos[4] = new Producto("Harina", 360);


        for (Producto producto : productos) {
            double precioTotal = producto.Calcular(5);
            System.out.println("El total vendido por "+ producto.getNombre() + " es $" + precioTotal);
        }

    }

    }
