import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Ingrese cantidad de dias");
        Scanner teclado = new Scanner(System.in);
        int total = teclado.nextInt();

        total = total * 2;
        System.out.println("precio de la campaña es $" + total );
    }
}
