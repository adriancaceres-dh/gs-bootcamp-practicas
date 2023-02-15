import java.text.DecimalFormat;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresá el monto bruto del premio: ");

        double montoBrutoPremio = scanner.nextDouble();

        double primerImpuesto = montoBrutoPremio * 0.0245;
        double segundoImpuesto = montoBrutoPremio * 0.15;
        double tercerImpuesto = montoBrutoPremio * 0.03;

        double montoNetoPremio = montoBrutoPremio - primerImpuesto - segundoImpuesto - tercerImpuesto;

        System.out.println("El monto neto del premio es de: $" + montoNetoPremio);

        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(montoNetoPremio);

        System.out.println("El monto neto del premio es de: $" + montoNetoPremioDecimal);

    }
}
