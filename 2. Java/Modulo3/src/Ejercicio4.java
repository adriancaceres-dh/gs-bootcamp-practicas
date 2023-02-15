import java.util.Scanner;

public class Ejercicio4 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Ingresé el monto de su premio");
            double precioNeto = scanner.nextDouble()*(0.7955);
            System.out.println("El premio que recibirá luego de impuestos es  " + precioNeto);
        }
}
