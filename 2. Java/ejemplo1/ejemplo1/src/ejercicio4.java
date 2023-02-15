import java.util.Scanner;
import java.text.DecimalFormat;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto total");
        double montoTotal = scanner.nextDouble();
        double montoFinal = montoTotal - (montoTotal*0.0245) - (montoTotal*0.15) - (montoTotal*0.03);
        System.out.println("El monto neto es de $" + montoFinal);
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoFinalDecimal = formatoDecimal.format(montoFinal);

        System.out.println("El monton neto del dinero ganado es de: $"+ montoNetoFinalDecimal);


    }
}
