import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double impuesto1 = 2.45;
        double impuesto2 = 15.00;
        double impuesto3 = 3.00;
        double total;
        double impuestoTotal;
        double totalNeto;

        System.out.println("Ingrese el valor bruto del premio"); //23563899

        total = scanner.nextDouble();

        impuestoTotal = total*(impuesto1+impuesto2+impuesto3)/100;

        totalNeto = total - impuestoTotal;

        DecimalFormat formatoDecimal = new DecimalFormat( "#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(totalNeto);

        System.out.println("El monto neto del premio es " + montoNetoPremioDecimal);
    }
}