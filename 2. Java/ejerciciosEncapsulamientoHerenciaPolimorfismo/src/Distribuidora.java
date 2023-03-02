import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    /*public Distribuidora(List<Producto> productos) {
        this.productos = productos;
    }
    List<Producto> productos = new ArrayList<>();*/

    public static void main(String[] args) {
        //Creo un array de productos
        Producto[] productos = new Producto[3];

        //Creo los elementos
        productos[0] = new Producto("harina", 50);
        productos[1] = new Perecedero("yogurt", 15, 3);
        productos[2] = new NoPerecedero("fideos", 30, "tipo1");

        //Calculo el precio total
        double total = 0;
        for (Producto producto: productos) {
            total += producto.calcular(5); //Polimorfismo
        }

        //Muestro el total
        System.out.println("el total es $"+total);
    }
}
