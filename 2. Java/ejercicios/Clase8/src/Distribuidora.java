import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<Producto>();

        productos.add(new Perecederos("Leche", 5.2, 2));
        productos.add(new NoPerecederos("Arroz", 2, "Grano"));
        productos.add(new NoPerecederos("Harina", 3.4, "Cereal"));
        productos.add(new NoPerecederos("Polenta", 2.8, "Grano"));
        productos.add(new Perecederos("Carne", 10.7, 3));
        productos.add(new Perecederos("Frutas", 8.4, 1));

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("El precio de 5 unidades de " + productos.get(i).nombre + " es: "
                    + productos.get(i).calcularPrecio(5));
        }
    }
}