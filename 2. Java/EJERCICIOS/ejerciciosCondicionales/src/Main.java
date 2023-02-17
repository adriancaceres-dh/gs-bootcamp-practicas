import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int cantSuscriptoresTodos = 0;
        int cantSuscriptoresAyC = 0;
        int cantSuscriptoresAyB = 0;
        int cantSuscriptoresByC = 0;
        int cantSuscriptoresA = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("suscripto al diario A 1-si 0-no");
            diarioA = scanner.nextInt();
            System.out.println("suscripto al diario B 1-si 0-no");
            diarioB = scanner.nextInt();
            System.out.println("suscripto al diario C 1-si 0-no");
            diarioC = scanner.nextInt();

            if (diarioA == 1 && diarioB == 1 && diarioC == 1) {
                cantSuscriptoresTodos++;
            } else if (diarioA == 1 && diarioC == 1) {
                cantSuscriptoresAyC++;
            } else if (diarioA == 1 && diarioB == 1) {
                cantSuscriptoresAyB++;
            } else if (diarioB == 1 && diarioC == 1) {
                cantSuscriptoresByC++;
            } else if (diarioA == 1) {
                cantSuscriptoresA++;
            }

        }
        System.out.println("los suscriptores a todos los diarios son: " + cantSuscriptoresTodos );
        System.out.println("los suscriptores a los diarios AyC son: " + cantSuscriptoresAyC );
        System.out.println("los suscriptores a los diarios AyB son: " + cantSuscriptoresAyB );
        System.out.println("los suscriptores a los diarios ByC son: " + cantSuscriptoresByC );
        System.out.println("los suscriptores al diario Ason: " + cantSuscriptoresA );

        }

    }
