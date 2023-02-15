import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        short costoFijoDiaCampania = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el número de días de campaña:");
        short diasCampania = scanner.nextShort();

        int costoTotalCampania = costoFijoDiaCampania * diasCampania;
        System.out.println("El costo de la campaña es de: $" + costoTotalCampania);

    }
}
