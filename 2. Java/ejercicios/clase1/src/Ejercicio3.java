import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dias:");
        int dias = scanner.nextInt();

        System.out.print("El costo total es: $" + dias*2);

    }}