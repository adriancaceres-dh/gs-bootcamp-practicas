import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto producto = new Producto("Leche Descremada", 250.25);
        Perecedero producto1 = new Perecedero("Lata de Arvejas", 150.25, 2);
        NoPerecedero producto2 = new NoPerecedero("Lampazo", 350.25, "Limpieza");

        productos.add(producto);
        productos.add(producto1);
        productos.add(producto2);

        double precioFinal = 0;
        for (Producto e : productos) {
            //System.out.println(e.getPrecio());
            precioFinal += e.calcular(5);
        }

        System.out.println("El precio total de la compra es: $" + precioFinal);

    }
}