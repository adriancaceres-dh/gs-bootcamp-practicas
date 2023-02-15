
import java.util.Scanner;

public class Ejercicio4Playground {
    public static void main(String[] args) {
        /*
        Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el ganador de la
        lotería de su país. El premio total es de $23.563.899, sin embargo, a este monto se le debe aplicar
        una serie de impuestos para poder otorgar el premio final. Entre estos descuentos
         por impuestos se encuentran:
         Impuesto 1 → 2,45% sobre el valor total
         Impuesto 2 → 15% sobre el valor total
         Impuesto 3 → 3% sobre el valor total
         Realizar un programa que le permita a cualquier ciudadano la posibilidad
         de ingresar el monto en bruto del premio y calcular a partir de él,
         el monto total neto que le corresponde como premio luego de aplicar los descuentos de los 3 impuestos.
          Tener en cuenta que todos los porcentajes de descuento se calculan SOBRE EL VALOR TOTAL.
         */
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese monto del premio");
            double premio = scanner.nextDouble();
            double primerimpuesto = premio * 0.0245;
            double segundoimpuesto = premio * 0.15;
            double tercerimpuesto = premio * 0.03;
            double premioNeto = premio - primerimpuesto - segundoimpuesto - tercerimpuesto;
            System.out.printf("El monto neto del premio es: $%.2f", premioNeto);
        }


    }}