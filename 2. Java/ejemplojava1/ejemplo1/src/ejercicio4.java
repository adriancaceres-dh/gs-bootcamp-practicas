import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto en bruto");
        double monto_bruto = scanner.nextDouble();
        double monto_neto = monto_bruto - (monto_bruto*0.0245) - (monto_bruto*0.15) - (monto_bruto*0.03);
        System.out.println("El monto neto es de $" + monto_neto);
    }
}
