import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicios vistos en clase

        /* Consigna
        * Una empresa quiere calcular el porcentaje de ventas
        * Se pide ingresar el total de ventas
        * Se pide ingresar un parcial de ventas
        * Por ultimo mostrar el resultado*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese total de ventas");
        double totalVentas = scanner.nextDouble();
        System.out.println("Ingrese parcial de ventas");
        double parcialVentas = scanner.nextDouble();
        double porcentajeVentas = parcialVentas/totalVentas*100;
        System.out.println("El porcentaje es " + porcentajeVentas);


        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.println("Ingrese un nombre");
        String nombre = scanner.next();
        System.out.println("El nombre ingresado es " + nombre);*/
/*
        //numero
        int i = 0;
        System.out.println(i);
        short pequenoNumero = 32767;
        byte maspequeno = 127;
        double numero = 15.0;
        float otroNumero = 50.0F;
        System.out.println(numero + " " + pequenoNumero + " " + otroNumero + " " + maspequeno);

        //booleano
        boolean flag = true;

        //letra
        char letra = 'p';
        System.out.println(letra);

        //string
        String palabra = "Pamela";
        System.out.println(palabra);
*/

    }
}