import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dias de la campania");
        int cantDias = scanner.nextInt();
        int precioPordia = 2;
        int precioFinal = precioPordia * cantDias;
        System.out.println("el precio de la campania es de $ " + precioFinal);

    }

}