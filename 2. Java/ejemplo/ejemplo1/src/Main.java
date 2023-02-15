import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Consigna
        Una empresa quiere calcular el porcentaje de ventas
        Se pide ingresar el total de ventas
        Se pide ingresar un parcial de ventas
        Por último mostrar el resultado
        */

        // parcial / total * 100
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese total de ventas");
        double totalVentas = scanner.nextDouble();
        System.out.println("Ingrese parcial de ventas");
        double parcialVentas = scanner.nextDouble();
        double porcentajeVentas = parcialVentas/totalVentas*100;
        System.out.println("El porcentaje es " + porcentajeVentas);

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.println("Ingrese un nombre ");
        String nombre = scanner.next();
        System.out.println("El nombre ingresado es " + nombre);
        */

        /*
        // Numero
        int i = 0;
        System.out.println(i);
        short pequeñoNumero = 32767;
        byte masPequeño = 127;
        double numero = 10.0;
        float otroNumero = 30.0F;
        System.out.println(numero + " " + masPequeño);
        boolean flag = true;
        // Letra
        char letra = 'a';
        System.out.println(letra);
        // Palabra
        String palabra = "Algo";
        System.out.println(palabra);
        */

    }
}