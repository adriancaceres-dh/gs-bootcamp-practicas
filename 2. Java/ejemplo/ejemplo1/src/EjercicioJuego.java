import java.util.Random;
import java.util.Scanner;

public class EjercicioJuego {
    public static void main(String[] args) {

        /*
            Consigna, realizar un juego donde se pida a un usuario
            adivinar un numero entre 1 y 10
            Se puede usar:
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(maximo);
         */

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(5);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero para adivinar, suerte!!!,  -1 termina");
            int numeroElegido = scanner.nextInt();

            if(numeroElegido == -1) break;
            if (numeroAleatorio == numeroElegido) {
                System.out.println("Adivinó");
                break;
            } else {
                System.out.println("No Adivinó, reintente");
            }
        }


    }
}
