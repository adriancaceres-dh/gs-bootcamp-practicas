import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de dinero ganado:");

        double dinero = scanner.nextInt();

        double impuesto1 = 2.5*dinero/100;
        double impuesto2 = 15*dinero/100;
        double impuesto3 = 3*dinero/100;

        double impuestosTotal= impuesto1+impuesto2+impuesto3;

        double totalDescuento = dinero-impuestosTotal;
        //System.out.println("La ganancia que te queda restando impuestos es: "+totalDescuento);

        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(totalDescuento);

        System.out.println("El monton neto del dinero ganado es de: $"+ montoNetoPremioDecimal);

    }
}
