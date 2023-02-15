import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese total de ventas");
        double totaldeventas = scanner.nextDouble();
        System.out.println("ingrese parcial de ventas");
        double parcialventas = scanner.nextDouble();
        double porcentajeventas = parcialventas/totaldeventas*100;



        /*
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = teclado.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.println("Ingrese un nombre");
        String nombre = teclado.next();
        System.out.println("El nombre ingresado es " + nombre);


        /*
        int i = 1;
        System.out.println(i);
        //numero
        short pequenoNumero = 22333;
        byte maspequeno = 123;
        double numero= 12.2;
        float otroNumero =30.0F;
        System.out.println(numero);
        boolean flag = true;
        //letra
        char letra ='a';
        System.out.println(letra);

         */







    }
}