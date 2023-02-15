import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner importAward = new Scanner(System.in);

        System.out.print("Ingrese el total del premio ganado: ");

        int award = importAward.nextInt();

        double impuesto1 = award * 0.0245;
        double impuesto2 = award * 0.15;
        double impuesto3 = award * 0.03;

        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String finalAward = formatoDecimal.format(award-impuesto1-impuesto2-impuesto3);

        System.out.println("El otal sin impuestos es de $" + finalAward);
    }
}
