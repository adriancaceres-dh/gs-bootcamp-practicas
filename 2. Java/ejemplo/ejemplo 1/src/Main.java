import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.println("Ingrese un nombre");
        String nombre = scanner.next();
        System.out.println("El nombre ingresado es " + nombre); */

        /*
        // Numeros
        int i = 0;
        System.out.println(i);
        short pequenoNumero = 32767;
        byte masPequeno = 127;
        double numero = 10.0;
        float otroNumero = 30F;
        System.out.println(numero);
        System.out.println(otroNumero);
        System.out.println(pequenoNumero + " " + masPequeno);

        // Booleano
        boolean flag = true;

        // Letras
        char letra = 'a';
        System.out.println(letra);
        String palabra = "Algo";
        System.out.println(palabra);
         */

        // Ejercicio Clase
        // parcial / total * 100
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese total de ventas");
        double totalVentas = scanner.nextDouble();
        System.out.println("Ingrese parcial de ventas");
        double parcialVentas = scanner.nextDouble();
        double porcentajeVentas = parcialVentas/totalVentas*100;
        System.out.println("El porcentaje es " + porcentajeVentas); */

        // Ejercicio 1
        /*
        String apellido = Gomez; // Debe llevar comillas
        int edad = "35"; // Lo escribe como String. Debe ir sin comillas
        boolean = "false" // Lo escribe como String. Debe ir sin comillas
        String sueldo = 45857.90 // Lo declara como String, debe ser double
        double nombre = "Julian" // Lo declara como double, debe ser String
         */

        // Ejercicio 2
        /*
        String 1nombre; // No puede empezar por un numero
        int edad; // Es correcto
        double $ueldo; // No se puede usar caracteres especiales
        String @pellido; // No se puede usar caracteres especiales
        String direccion; // Es correcto
        booblean licencia_de_conducir; // Se puede usar el snake case
        double estatura de la persona; // No se pueden dejar espacios
        int cantidad-de-hijos; // Tiene que ser snake case o camel case
        */

        // Ejercicio 3
        /*System.out.println("Ejercicio 3");
        System.out.println("-------------");

        double precioDia = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los días de publicidad");
        int dias = scanner.nextInt();
        double costoTotal = precioDia * dias;
        System.out.println("El precio total de la publicidad es $" +  costoTotal);*/


        // Ejercicio 4
        System.out.println("Ejercicio 4");
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del premio");
        double premio = scanner.nextDouble();

        double impuesto1 = premio * 2.45 / 100;
        double impuesto2 = premio * 15 / 100;
        double impuesto3 = premio * 3 / 100;

        System.out.println("El primer impuesto es del 2,45% representa $" + impuesto1);
        System.out.println("El segundo impuesto es del 15% representa $" + impuesto2);
        System.out.println("El tercer impuesto es del 3% representa $" + impuesto3);

        double totalImpuestos = (impuesto1 + impuesto2 + impuesto3);
        double totalPremio = premio - totalImpuestos;
        System.out.println("El premio total es de $" + totalPremio);









    }
}