import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int suscriptosATodos = 0;
        int suscriptosAyC = 0;
        int suscriptosAyB = 0;
        int suscriptosByC = 0;
        int suscriptosA = 0;

        for( int i = 0; i < 5; i++){
         System.out.println("Suscripto al diario A, 1-SI 0-NO");
         diarioA = scanner.nextInt();
         System.out.println("Suscripto al diario B, 1-SI 0-NO");
         diarioB = scanner.nextInt();
         System.out.println("Suscripto al diario C, 1-SI 0-NO");
         diarioC = scanner.nextInt();

         if(diarioA == 1 && diarioB ==1 && diarioC == 1){
            suscriptosATodos++;
         } else if ( diarioA == 1 && diarioC == 1){
             suscriptosAyC++;
         } else if ( diarioA == 1 && diarioB == 1){
             suscriptosAyB++;
         } else if (diarioB == 1 && diarioC == 1){
             suscriptosByC++;
         } else {
             suscriptosA++;
         }
    }
        System.out.println("La cantidad de suscriptores a todos es " + suscriptosATodos);
        System.out.println("La cantidad de suscriptores a todos es " + suscriptosAyC);
        System.out.println("La cantidad de suscriptores a todos es " + suscriptosAyB);
        System.out.println("La cantidad de suscriptores a todos es " + suscriptosByC);
        System.out.println("La cantidad de suscriptores a todos es " + suscriptosA);
    }
}
