import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        /*Producto vino = new Producto("Rutini", 4000);
        System.out.println(vino.calcular(4));

        Producto carne = new Perecedero("Costilla",1500,3);
        System.out.println(carne.calcular(1));*/

        List<Producto> productos = new ArrayList<>();
        Producto producto = new Producto("Milanesa", 750);
        Producto producto1 = new Perecedero("Crema",270,2);
        Producto producto2 = new NoPerecedero("Yerba", 650, "Almacen");

        productos.add(producto);
        productos.add(producto1);
        productos.add(producto2);

        double totalCompra = 0;

        for (Producto productoActual : productos){
            totalCompra += productoActual.calcular(5);
        }
        System.out.println("El total de la compra es: $" + totalCompra);
    }
}