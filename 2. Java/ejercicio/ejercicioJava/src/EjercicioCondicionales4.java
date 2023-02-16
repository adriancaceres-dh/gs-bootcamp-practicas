import java.util.Scanner;

public class EjercicioCondicionales4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diarios3 = 0;
        int diariosAC = 0;
        int diariosAB = 0;
        int diariosBC = 0;
        int diariosA = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Bienvenido " + i + ". Elija su subcripcion de diario: 1- Los 3 diarios | 2- Diarios A y C | 3- diarios A y B | -4 Diarios B y C | -5 Diario A");

            int opcionElegida = scanner.nextInt();

            if (opcionElegida == 1) {
                diarios3 ++;
            } else if (opcionElegida == 2) {
                diariosAC ++;
            } else if (opcionElegida == 3) {
                diariosAB ++;
            } else if (opcionElegida == 4) {
                diariosBC ++;
            } else if (opcionElegida == 5){
                diariosA ++;
            } else {
                System.out.println("opcion no encontrada. Marque del 1 al 5");
            }

        }

        System.out.println("La cantidad de personas suscriptas a los 3 diarios es " + diarios3);
        System.out.println("La cantidad de personas suscriptas a los diarios A y C es de " + diariosAC);
        System.out.println("La cantidad de personas suscriptas a los diarios A y B de " + diariosAB);
        System.out.println("La cantidad de personas suscriptas a los diarios B y C de " + diariosBC);
        System.out.println("La cantidad de personas suscriptas al diario A es " + diariosA);

    }
}
