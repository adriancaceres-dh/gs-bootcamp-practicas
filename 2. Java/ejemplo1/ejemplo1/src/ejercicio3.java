import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
            short costoPorDia = 2;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresar el número de días:");
            short dias = scanner.nextShort();

            int costoTotal = costoPorDia * dias;
            System.out.println("El costo de la campaña es de $" + costoTotal);
        }

    }

