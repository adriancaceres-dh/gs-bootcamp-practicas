import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        /* Ejercicio 3

        El precio por día de campaña es de $2 dólares fijos. Realizar un programa que a partir del ingreso de la
        cantidad de días, devuelva por pantalla el monto total.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de días que durará la campaña: ");
        int cantidadDeDias = scanner.nextInt();
        int precioDia = 2;
        int montoTotal = precioDia * cantidadDeDias;
        System.out.println("El costo total de la campaña publicitaria es de $"+ montoTotal);

    }
}
