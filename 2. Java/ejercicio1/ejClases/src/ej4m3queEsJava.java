import java.util.Scanner;

public class ej4m3queEsJava {
    public static void main(String[] args) {
        Scanner importAward = new Scanner(System.in);

        System.out.print("Ingresar el total: ");

        int award = importAward.nextInt();

        double tax = award * 0.2045;

        double finalAward = award - tax;

        System.out.println("El total es $ " + finalAward);
    }
}