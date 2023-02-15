import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej4_PLayG {
    /* Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el ganador de la lotería de su país.
     El premio total es de $23.563.899, sin embargo, a este monto se le debe aplicar una serie de impuestos para poder otorgar
     el premio final. Entre estos descuentos por impuestos se encuentran:
                Impuesto 1 → 2,45% sobre el valor total
                Impuesto 2 → 15% sobre el valor total
                Impuesto 3 → 3% sobre el valor total
     Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el monto en bruto del premio y
     calcular a partir de él, el monto total neto que le corresponde como premio luego de aplicar los descuentos de los 3
     impuestos. Tener en cuenta que todos los porcentajes de descuento se calculan SOBRE EL VALOR TOTAL.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double porcentajePrimerImp = 2.45;
        double porcentajeSegundoImp = 15;
        double porcentajeTercerImp = 3;

        System.out.println("Ingrese el monto bruto");
        double montoBruto = scanner.nextDouble();

        double primerImpuesto = (montoBruto*porcentajePrimerImp)/100;
        double segundoImpuesto = (montoBruto*porcentajeSegundoImp)/100;
        double tercerImpuesto = (montoBruto*porcentajeTercerImp)/100;
        double totalImpuestos = (primerImpuesto+segundoImpuesto+tercerImpuesto);
        double montoNeto = montoBruto - totalImpuestos ;
        System.out.println("El monto a recibir es de " + montoNeto);

        DecimalFormat formatoDecimal = new DecimalFormat( "#.##");
        String montoNetoDecimal = formatoDecimal.format(montoNeto);

        System.out.println("El monto a recibir es de " + montoNetoDecimal);
    }

}
