import java.util.Scanner;

public class ejercicio4_ {
    public static void main(String[] args) {
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int diarioAC = 0;
        int diarioAB = 0;
        int diarioABC = 0;
        int diarioBC = 0;
        int diarioSoloA = 0;

        for (int i = 0; i < 3; i++) {
            Scanner scannerSuscripcion = new Scanner(System.in);
            System.out.println("Ingrese el diario al que esta suscripto: \n 1) Diario A \n 2) Diario B \n 3) Diario C \n 4) Diario AC \n 5) Diario AB \n 6) Diario ABC \n 7) Diario BC");
            int diarioSuscripto = scannerSuscripcion.nextInt();

            if (diarioSuscripto == 1) {
                diarioSoloA++;
                diarioA++;
            } else if (diarioSuscripto == 2) {
                diarioB++;
            } else if (diarioSuscripto == 3) {
                diarioC++;
            } else if (diarioSuscripto == 4) {
                diarioA++;
                diarioC++;
                diarioAC++;
            } else if (diarioSuscripto == 5) {
                diarioAB++;
                diarioA++;
                diarioB++;
            } else if (diarioSuscripto == 6) {
                diarioABC++;
                diarioC++;
                diarioA++;
                diarioB++;
            } else if (diarioSuscripto == 7) {
                diarioBC++;
                diarioC++;
                diarioB++;
            } else {
                System.out.println("Ingresa una opción válida");
            }

        }
        System.out.println("Están suscriptos solo al diario A: " + diarioSoloA);
        System.out.println("Están suscriptos a los tres diarios: " + diarioABC);
        System.out.println("Están suscriptos al diario A y C: " + diarioAC);
        System.out.println("Están suscriptos al diario A y B: " + diarioAB);
        System.out.println("Están suscriptos al diario B y C: " + diarioBC);


    }
}