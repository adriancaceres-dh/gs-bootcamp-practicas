import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la prenda");
        double valor= scanner.nextDouble();

        System.out.println("Ingrese la fabrica");
        double numeroFabrica= scanner.nextDouble();

        if(numeroFabrica == 1) {
            double valor1 = valor + (valor * 0.07);
            valor1 = valor1 + (valor1 * 0.25);
            System.out.println(valor1);
        }
    }
}