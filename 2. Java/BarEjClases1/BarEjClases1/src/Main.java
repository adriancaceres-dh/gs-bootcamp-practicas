import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //parcial / total *100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de ventas");
        double totalVentas = scanner.nextDouble();

        System.out.println("Ingrese el parcial de ventas");
        double parcialVentas = scanner.nextDouble();
        double porcentajeVentas = parcialVentas/totalVentas*100;
        System.out.println("El porcentaje es " + porcentajeVentas);


        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es " + numero);

        System.out.println("Ingrese un nombre");
        String nombre = scanner.next();
        System.out.println("El nombre ingresado es " + nombre);
        */

    /*
        //Número

        int i = 2;
        System.out.println(i);
        short pequenoNumero = 32767;
        byte maspequeno = 127;
        double numero = 10.0;
        float otroNumero =30.F;
        System.out.println(numero);
        boolean flag = true;

        //Letra
        char letra = 'a';
        string palabra = "Hola"; */

    }
}