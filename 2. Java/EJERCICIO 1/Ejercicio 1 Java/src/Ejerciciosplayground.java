import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejerciciosplayground {
    public static void main(String[] args) {
       /* //ejercicio 1

        String apellido = "Gomez";// lleva comillas dobles al ser string "Gomez"
        int edad = 35; // va sin comillas
        boolean jueves  = false; // va sin comillas y agregamos nombre variable
        double sueldo = 45857.90; // falta ; y modificamos de string a un double
        String nombre = "Julián"; //modificamos de double a string
*/
      /*  //ejercicio 2
        String 1nombre; //no puede empezar con un numero el nombre de la variable
        int edad; // correcto
        double $ueldo; // no puede utilizar caracteres especiales
        String @pellido; // no puede utilizar caracteres especiales
        String direccion; //correcto
        boolean licencia_de_conducir; //correcto
        double estatura de la persona; // no puede incluir espacios en blanco
        int cantidad-de-hijos; // no puede utilizar caracteres especiales

       */

       /* //ejercicio 3

         int total;

        System.out.println("ingrese Cantidad de días");
       Scanner teclado = new Scanner(System.in);
        total = teclado.nextInt();
        total = total * 2;
        System.out.println("El precio de la campaña es " + total);

        */

        //ejercicio 4
        Scanner scanner = new Scanner(System.in);
        double impuesto1 = 2.45;
        double impuesto2 = 15.00;
        double impuesto3 = 3.00;
        double total;
        double impuestoTotal;
        double totalNeto;

        System.out.println("Ingrese el valor bruto del premio");

        total = scanner.nextDouble();

        impuestoTotal = total*(impuesto1+impuesto2+impuesto3)/100;

        totalNeto = total - impuestoTotal;

        DecimalFormat formatoDecimal = new DecimalFormat( "#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(totalNeto);

        System.out.println("El monto neto del premio es " + montoNetoPremioDecimal);

    }

}
