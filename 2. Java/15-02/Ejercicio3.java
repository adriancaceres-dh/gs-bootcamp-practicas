import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner quantityDays = new Scanner(System.in);

        System.out.print("Ingrese los días de camapaña");

        int days = quantityDays.nextInt();

        int totalCost = days * 2;

        System.out.println("El costo total de campaña es $ " + totalCost);
    }
}
