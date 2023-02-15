import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio4 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese monto bruto");
            double total = teclado.nextDouble();

            double impuesto1 = 2.45;
            double impuesto2 = 15;
            double impuesto3 = 3;

            double impuestoTotal = impuesto1 + impuesto2 + impuesto3;
            total = total - (total * impuestoTotal / 100);

            DecimalFormat formatoDecimal = new DecimalFormat( "#.##");
            String montoNetoPremioDecimal = formatoDecimal.format(total);
            System.out.println("monto total " + montoNetoPremioDecimal);
        }
}
