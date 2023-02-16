import java.util.Scanner;

public class Ej4_cyR_PlayG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tresDiarios = 0;
        int diarioAC = 0;
        int diarioAB = 0;
        int diarioBC = 0;
        int diarioA = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Persona N°" + (i + 1));
            System.out.println("Esta suscripto al Diario A? 1: Si, 2: No");
            int A = scanner.nextInt();

            System.out.println("Persona N°" + (i + 1));
            System.out.println("Esta suscripto al Diario B? 1: Si, 2: No");
            int B = scanner.nextInt();

            System.out.println("Persona N°" + (i + 1));
            System.out.println("Esta suscripto al Diario C? 1: Si, 2: No");
            int C = scanner.nextInt();
            if (A == 1 && B == 1 && C == 1) {
                tresDiarios = tresDiarios + 1;
            } else if (A == 1 && C == 1) {
                diarioAC = diarioAC + 1;
            } else if (A == 1 && B == 1) {
                diarioAB = diarioAB + 1;
            } else if (B == 1 && C == 1) {
                diarioBC = diarioBC + 1;
            } else if (A == 1) {
                diarioA = diarioA + 1;
            }
        }

        System.out.println("Personas suscriptas a los tres diarios: " + tresDiarios);
        System.out.println("Personas suscriptas a diarios A y C: " + diarioAC);
        System.out.println("Personas suscriptas a diarios A y B: " + diarioAB);
        System.out.println("Personas suscriptas a diarios B y C: " + diarioBC);
        System.out.println("Personas suscriptas a diario A: " + diarioA);
    }
}


