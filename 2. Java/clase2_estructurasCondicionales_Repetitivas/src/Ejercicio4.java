import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int diarios3 = 0;
        int diariosAyB = 0;
        int diariosAyC = 0;
        int diariosByC = 0;
        int diarioA = 0;

        for(int i = 1; i <= 50; i++){

            System.out.println("Opciones: 1.- Los 3 diarios, 2.- Diarios A y B, 3.- Diarios A y C, 4.- Diarios By C, 5.- Diario A");
            System.out.println("Persona número " + i + ":");
            int opcionElegida = scanner.nextInt();

            if(opcionElegida == 1){
                diarios3++;
            }else if(opcionElegida == 2){
                diariosAyB++;
            }else if(opcionElegida == 3){
                diariosAyC++;
            }else if(opcionElegida == 4){
                diariosByC++;
            }else if(opcionElegida == 5){
                diarioA++;
            }else{
                System.out.println("Opción no encontrada, favor de marcar del 1 al 5");
            }

        }

        System.out.println("Los suscriptos a los 3 diarios son: " + diarios3 + " personas.");
        System.out.println("Los suscriptos a los diarios A y B son: " + diariosAyB + " personas.");
        System.out.println("Los suscriptos a los diarios A y C son: " + diariosAyC + " personas.");
        System.out.println("Los suscriptos a los diarios B y C son: " + diariosByC + " personas.");
        System.out.println("Los suscriptos al diario A son: " + diarioA + " personas.");

    }
}
