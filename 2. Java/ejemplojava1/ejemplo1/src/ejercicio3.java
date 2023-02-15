import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas");
        double cantidad_horas = scanner.nextDouble();
        double total = cantidad_horas*2;
        System.out.println("El costo total sera de $" + total);
    }
}
