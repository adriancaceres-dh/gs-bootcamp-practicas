import java.util.Scanner;

public class Ej_4_Pg_Clase_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diarios3 = 0;
        int diariosAC = 0;
        int diariosAB = 0;
        int diariosBC = 0;
        int diariosA = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Bienenido " + i + " Elija su subscripción de diario: 1- Los 3 diarios | 2- Diarios A y C | 3- Diarios A y B | 4- Diarios B y C | 5- Diario A");

            int opcionElegida = scanner.nextInt();

            if (opcionElegida == 1){
                diarios3++;
            } else if (opcionElegida == 2){
                diariosAC++;
            } else if (opcionElegida == 3) {
                diariosAB++;
            } else if (opcionElegida == 4) {
                diariosBC++;
            } else if (opcionElegida == 5){
                diariosA++;
            } else {
                System.out.println("Opción no encontrada. Marque de 1 a 5");
            }
        }

        System.out.println("La cantidad total de personas subscriptas es de " + (diarios3 + diariosA + diariosAB + diariosAC + diariosBC));
        System.out.println("La cantidad de subscriptos a los 3 diarios es de " + diarios3);
        System.out.println("La cantidad de subscriptos al diario A y C es de " + diariosAC);
        System.out.println("La cantidad de subscriptos al diario A y B es de  " + diariosAB);
        System.out.println("La cantidad de subscriptos al diario B y C es de  " + diariosBC);
        System.out.println("La cantidad de subscriptos al diario A es de " + diariosA);
    }
}
