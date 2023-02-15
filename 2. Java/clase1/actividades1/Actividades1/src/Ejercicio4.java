import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el premio total");
        double premioTotal = scanner.nextDouble();
        double reduccion = premioTotal * 20.45;
        double reducciondivision = reduccion / 100;
        double montoBruto = premioTotal - reducciondivision;
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(montoBruto);

        System.out.println("El monto neto del premio es de: $" + montoNetoPremioDecimal);
    }
}
