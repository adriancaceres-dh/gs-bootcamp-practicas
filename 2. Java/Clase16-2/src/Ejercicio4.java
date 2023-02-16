import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contadorPersonas = 1, contadorDiarioAC =0, contadorDiarioAB = 0,
                contadorDiarioBC = 0, contadorDiarioA = 0, contadorTodos = 0;
        String diarioA, diarioB, diarioC;

        Scanner scanner = new Scanner(System.in);

        while (contadorPersonas <= 3) {

            System.out.println("Datos relevador de la persona numero: " + contadorPersonas);
            System.out.println("Ingrese 'si' si la persona esta suscripta al Diario A");
            diarioA = scanner.next();
            System.out.println("Ingrese 'si' si la persona esta suscripta al Diario B");
            diarioB = scanner.next();
            System.out.println("Ingrese 'si' si la persona esta suscripta al Diario C");
            diarioC = scanner.next();

            if (diarioA.equalsIgnoreCase("si") && !diarioB.equalsIgnoreCase("si") && !diarioC.equalsIgnoreCase("si")) {
                contadorDiarioA++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorDiarioAC++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioB.equalsIgnoreCase("si")) {
                contadorDiarioAB++;
            }
            if (diarioB.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorDiarioBC++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioB.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorTodos++;
            }

            contadorPersonas++;

        }

        System.out.println("La cantidad de suscriptores que tienen los 3 diarios son: " + contadorTodos);
        System.out.println("La cantidad de suscriptores que tiene el diario A son: " + contadorDiarioA);
        System.out.println("La cantidad de suscriptores que tienen los diarios A y C son: " + contadorDiarioAC);
        System.out.println("La cantidad de suscriptores que tienen los diarios A y B son: " + contadorDiarioAB);
        System.out.println("La cantidad de suscriptores que tienen los diarios B y C son: " + contadorDiarioBC);

    }
}
