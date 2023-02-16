import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        /* Ejercicio 4
        Entre estos descuentos por impuestos se encuentran:
        Impuesto 1 → 2,45% sobre el valor total
        Impuesto 2 → 15% sobre el valor total
        Impuesto 3 → 3% sobre el valor total
        Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el monto en bruto del premio
        y calcular a partir de él, el monto total neto que le corresponde como premio luego
        de aplicar los descuentos de los 3 impuestos.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto en bruto del premio:");
        double premioEnBruto = scanner.nextDouble();

        double impuestoUno = 2.45;
        double impuestoDos = 15;
        double impuestoTres = 3;
        double totalImpuestos = impuestoUno+impuestoDos+impuestoTres;
        double descuentoFinal = premioEnBruto*totalImpuestos/100;
        double netoACobrar = premioEnBruto - descuentoFinal;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("______________________________________________________________");
        System.out.println("El porcentaje total de descuento es: %" +totalImpuestos);
        System.out.println("______________________________________________________________");
        System.out.println("El descuento total es de: $"+ df.format(descuentoFinal));
        System.out.println("El descuento total es de: $"+ String.format("%.2f", descuentoFinal));
        System.out.println("El descuento total es de: $"+ (double)Math.round(descuentoFinal*100d)/100);
        System.out.println("______________________________________________________________");
        System.out.println("El monto final a cobrar es: $"+df.format(netoACobrar));
        System.out.println("El monto final a cobrar es: $"+ String.format("%.2f", netoACobrar));
        System.out.println("El monto final a cobrar es: $"+ (double)Math.round(netoACobrar*100d)/100);
        System.out.println("______________________________________________________________");

    }
}
