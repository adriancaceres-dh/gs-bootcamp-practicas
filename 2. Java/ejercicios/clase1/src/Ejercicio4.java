import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de su premio:");
        int premio = scanner.nextInt();
        System.out.println("Impuesto 1: $" + premio*0.0245);
        System.out.println("Impuesto 2: $" + premio*0.15);
        System.out.println("Impuesto 3: $" + premio*0.03);
        System.out.print("Monto neto del premio: $" + (premio - (premio*0.0245 + premio*0.15 + premio*0.03)));
    }}