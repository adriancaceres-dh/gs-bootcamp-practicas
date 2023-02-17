import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Ejercicio 1:
    /*
        String apellido = "Gomez";
        int edad = 35;
        boolean var = false;
        double sueldo = 45857.90;
        String nombre = "Julián";
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(var);
        System.out.println(sueldo);
        System.out.println(nombre);
    */

        //Ejercicio 2:
        /*String nombre;
        int edad;
        double sueldo;
        String apellido;
        String direccion;
        boolean licencia_de_conducir;
        double estatura_de_la_persona;
        int cantidad_de_hijos;*/

        //Ejercicio 3:

        /*Scanner scanner = new Scanner(System.in);
        int total;
        System.out.println("Ingrese cantidad de dias");
        total = scanner.nextInt();
        total = total*2;
        System.out.println("El monto total de campaña es " + total);*/

        //Ejercicio 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto bruto del premio");
        double premio = scanner.nextDouble();
        double impuesto1 = premio * 2.45 / 100;
        double impuesto2 = premio * 15 / 100;
        double impuesto3 = premio * 3 / 100;

        System.out.println("El primer impuesto es de $ " + impuesto1);
        System.out.println("El segundo impuesto es de $ " + impuesto2);
        System.out.println("El tercer impuesto es de $ " + impuesto3);

        double totalImpuestos;
        double totalNeto;

        totalImpuestos = impuesto1 + impuesto2 + impuesto3;
        totalNeto = premio - totalImpuestos;

        System.out.println("El premio total es de $ " + totalNeto);
    }
}

