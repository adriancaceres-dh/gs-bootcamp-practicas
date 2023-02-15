import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total;

        System.out.println("Ingrese Cantidad de dias");

        total = scanner.nextInt();

        total = total * 2;
        System.out.println("El precio de la campaña es " + total);
    }
}
