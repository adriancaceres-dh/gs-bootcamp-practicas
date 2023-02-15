import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el importe del premio");
        double importePremio = scanner.nextDouble();

        double impuesto1 = importePremio * 2.45 / 100;
        double impuesto2 = importePremio * 15 / 100;
        double impuesto3 = importePremio * 3 / 100;
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoPremioDecimal = formatoDecimal.format((importePremio-impuesto1-impuesto2-impuesto3));
        System.out.println("Total sin impuestos" +  montoNetoPremioDecimal  );

    }
}
