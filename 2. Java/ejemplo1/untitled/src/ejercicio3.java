import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de días");
        int cantidadDias = scanner.nextInt();
        int precioPorDia= 2;

        int costoTotal = precioPorDia * cantidadDias;
        System.out.println("El costo total de la campaña es " + costoTotal);
    }
}
