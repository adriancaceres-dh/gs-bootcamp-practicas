import java.text.DecimalFormat;
import java.util.Scanner;

public class EstructuraControl2 {

    public static void main(String[] args) {
        Scanner scannerDni = new Scanner(System.in);

        System.out.print("ingrese DNI del empleado");

        int dni = scannerDni.nextInt();

        Scanner scannerMonto = new Scanner(System.in);

        System.out.print("ingrese sueldo del empleado");

        double sueldo = scannerMonto.nextInt();

        if (sueldo <= 20000) {
            double sueldoNuevo = sueldo * 1.20;
            DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            String sueldoFinal = formatoDecimal.format(sueldoNuevo);
            System.out.print("El porcentaje de aumento del empleado con DNI: "  + dni + " es del 20%. Su sueldo actualizado es: $" + sueldoFinal );
        } else if (sueldo > 20000 && sueldo <= 45000)  {
            double sueldoNuevo = sueldo * 1.10;
            DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            String sueldoFinal = formatoDecimal.format(sueldoNuevo);
            System.out.print("El porcentaje de aumento del empleado con DNI: "  + dni + " es del 10%. Su sueldo actualizado es: $" + sueldoFinal);
        } else {
            double sueldoNuevo = sueldo * 1.05;
            DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            String sueldoFinal = formatoDecimal.format(sueldoNuevo);
            System.out.print("El porcentaje de aumento del empleado con DNI: "  + dni + " es del 5%. Su sueldo actualizado es: $" + sueldoFinal);
        }

    }
}
