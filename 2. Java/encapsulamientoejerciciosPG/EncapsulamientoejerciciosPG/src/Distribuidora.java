import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        List<Producto> productos =  new ArrayList<>();
        Producto producto = new Producto("fideos", 2.5);
        Producto producto1 = new Perecedero("cerveza", 5.0, 2);
        Producto producto2 = new Noperecedero("yerba", 2.0, "almacen");


        productos.add(producto);
        productos.add(producto1);
        productos.add(producto2);

        double totalCompra = 0;

        for (Producto productoActual : productos) {
            totalCompra += productoActual.calcular(5);
        }
        System.out.println("El resultado de la compra es $ " + totalCompra);

    }
}
