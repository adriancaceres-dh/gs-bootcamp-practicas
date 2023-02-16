import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usuarios = 0;

        int suscripcion1 = 0;
        int suscripcion2 = 0;
        int suscripcion3 = 0;
        int suscripcion4 = 0;
        int suscripcion5 = 0;

        while (usuarios < 51) {
            int usuariosX = usuarios++;

            System.out.println("Elija una suscripcion: \n1- a los 3 diarios , \n2- al Diario A y al Diario C, \n3- al Diario A y al Diario B, \n4- al Diario B y al Diario C o \n5- sólo al Diario A\n");
            int suscripcion = scanner.nextInt();

            int suscripcion1X=0;
            int suscripcion2X=0;
            int suscripcion3X=0;
            int suscripcion4X=0;
            int suscripcion5X=0;

            if (suscripcion == 1) {
                suscripcion1X = suscripcion1++;
                } else if (suscripcion == 2) {
                        suscripcion2X = suscripcion2++;
                    } else if (suscripcion == 3) {
                            suscripcion3X = suscripcion3++;
                        } else if (suscripcion == 4) {
                                suscripcion4X = suscripcion4++;
                            } else if (suscripcion == 5) {
                                    suscripcion5X = suscripcion5++;
            }

            System.out.println(suscripcion1X+" personas estan suscriptas a los 3 diarios. \n"+ suscripcion2X+" personas estan suscriptas al diario A y C. \n" + suscripcion3X+" personas estan suscriptas al diario A y B. \n"+ suscripcion4X+" personas estan suscriptas al diario B y C. \n" + suscripcion5X+" personas estan suscriptas al diario A. \n" );

        }
    }
}
