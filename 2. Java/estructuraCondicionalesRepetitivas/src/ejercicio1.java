import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la prenda");
        double valor= scanner.nextDouble();

        System.out.println("Ingrese numero de la fabrica");
        double numeroFabrica= scanner.nextDouble();

        if(numeroFabrica == 1) {
            double valor1 = valor + (valor * 0.07);
            valor1 = valor1 + (valor1 * 0.25);
            System.out.println("El valor total "+ valor1);
        } else if (numeroFabrica == 2) {
            double valor2 = valor + (valor * 0.15);
            valor2 = valor2 + (valor2 * 0.25);
            System.out.println("El valor total " + valor2);
        }else if (numeroFabrica == 3) {
            double valor3 = valor + (valor * 0.22);
            valor3 = valor3 + (valor3 * 0.25);
            System.out.println("El valor total " +valor3);
        }else{
            System.out.println("El numero de la fabrica no se encuentra");
        }


    }
}
