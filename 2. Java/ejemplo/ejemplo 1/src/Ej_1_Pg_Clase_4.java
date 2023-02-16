import java.util.Scanner;

public class Ej_1_Pg_Clase_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de compra");
        double precioCompra = scanner.nextDouble();
        double precioProducto = 0;

        System.out.println("Ingrese N° de fabrica");

        int fabrica = scanner.nextInt();

        if (fabrica < 1 || fabrica > 3) {
            System.out.println("No se encuentra el nro de fabrica ingresado");
        } else {
            if (fabrica == 1) {
                precioProducto = precioCompra + (precioCompra * 7 / 100);
            } else if (fabrica == 2) {
                precioProducto = precioCompra + (precioCompra * 15 / 100);
            } else {
                precioProducto = precioCompra + (precioCompra * 22 / 100);
            }
        }

        double ganancia = precioProducto * 25 / 100;
        double precioVenta = precioProducto + ganancia;

        System.out.println("El valor de venta es: $" + precioVenta);


    }
}
