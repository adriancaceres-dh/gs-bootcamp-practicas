import java.util.Scanner;

public class Ej_3_Pg {
        public static void main(String[] args) {
                // Ejercicio 3
                System.out.println("Ejercicio 3");
                System.out.println("-------------");

                double precioDia = 2;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese los días de publicidad");
                int dias = scanner.nextInt();
                double costoTotal = precioDia * dias;
                System.out.println("El precio total de la publicidad es $" + costoTotal);

        }
}
