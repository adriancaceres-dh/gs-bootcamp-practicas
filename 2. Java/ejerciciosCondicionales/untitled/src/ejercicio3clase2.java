import java.util.Scanner;
public class ejercicio3clase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int c = 1; c <= 7; c++) {
            System.out.println("Ingrese el número del servicio adquirido");
            int numero = scanner.nextInt();
            if (numero == 1) {
                System.out.println("El monto final a pagar es de $1500");
            } else if (numero == 2) {
                System.out.println("El monto final a pagar es de $2200");
            } else {
                System.out.println("No existe ese número de servicio");
            }
        }
    }
}
