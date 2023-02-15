import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los días de campaña");
        double diasCampania = scanner.nextDouble();
        double precioCampania = diasCampania * 2;
        System.out.println("El monto total de la campaña es " + precioCampania);
    }
}
