import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de costo");
        double precioCosto = scanner.nextDouble();
        System.out.println("Ingrese el número de la fábrica");
        int numero = scanner.nextInt();
        double porcentajeEnvio = 0.0;
        if (numero == 1) {
            porcentajeEnvio = precioCosto * 0.07 + precioCosto;
        } else if (numero == 2) {
            porcentajeEnvio = precioCosto * 0.15 + precioCosto;
        } else if (numero == 3) {
            porcentajeEnvio = precioCosto * 0.22 + precioCosto;
        } else {
            System.out.println("No existe ese número de fábrica");
        }
        double precioVenta = porcentajeEnvio * 0.25 + porcentajeEnvio;
        System.out.println("El precio de venta del producto es de $ " + precioVenta);
    }
}
/*
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de costo");
        double precioCosto = scanner.nextDouble();
        System.out.println("Ingrese el número de la fábrica");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1: precioCosto * 0.07 + precioCosto;
        }

    }
}
*/
