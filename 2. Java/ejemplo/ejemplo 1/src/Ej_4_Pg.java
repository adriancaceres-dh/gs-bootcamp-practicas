import java.util.Scanner;

public class Ej_4_Pg {
    public static void main(String[] args) {
        // Ejercicio 4

        System.out.println("Ejercicio 4");
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del premio");
        double premio = scanner.nextDouble();

        double impuesto1 = premio * 2.45 / 100;
        double impuesto2 = premio * 15 / 100;
        double impuesto3 = premio * 3 / 100;

        System.out.println("El primer impuesto es del 2,45% representa $" + impuesto1);
        System.out.println("El segundo impuesto es del 15% representa $" + impuesto2);
        System.out.println("El tercer impuesto es del 3% representa $" + impuesto3);

        double totalImpuestos = (impuesto1 + impuesto2 + impuesto3);
        double totalPremio = premio - totalImpuestos;
        System.out.println("El premio total es de $" + totalPremio);

    }

}
