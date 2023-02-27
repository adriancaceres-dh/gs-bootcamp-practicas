import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner quantityDays = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días que durará la campaña: ");

        int days = quantityDays.nextInt();

        double totalCost = days * 2.0;

        System.out.println("El costo total de la campaña es de $" + totalCost);
    }
}
