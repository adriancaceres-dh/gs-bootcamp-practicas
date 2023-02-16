import java.util.Scanner;
public class ejercicio4clase2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int personas = 1;
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int diarioAB = 0;
        int diarioAC = 0;
        int diarioBC = 0;
        int diario3 = 0;
        int diario1 = 0;

        while (personas <= 5) {
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
            System.out.println("Seleccione la opcion segun corresponda:");
            System.out.println("1: solo subscripto diario A");
            System.out.println("2: solo subscripto diario B");
            System.out.println("3: solo subscripto diario C");
            System.out.println("4: subscripto a diarios A y B");
            System.out.println("5: subscripto a diarios A y C");
            System.out.println("6: subscripto a diarios B y C");
            System.out.println("7: suscripto a los 3 diarios");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    diarioA++;
                    diario1++;
                    break;
                case 2:
                    diarioB++;
                    diario1++;
                    break;
                case 3:
                    diarioC++;
                    diario1++;
                    break;
                case 4:
                    diarioAB++;
                    diarioA++;
                    diarioB++;
                    break;
                case 5:
                    diarioAC++;
                    diarioA++;
                    diarioC++;
                    break;
                case 6:
                    diarioBC++;
                    diarioB++;
                    diarioC++;
                    break;
                case 7:
                    diario3++;
                    diarioA++;
                    diarioB++;
                    diarioC++;
                    diarioAB++;
                    diarioAC++;
                    diarioBC++;
            }
            personas++;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("La cantidad de suscriptores a los 3 diarios son: " + diario3);
        System.out.println("La cantidad de suscriptores a los diarios A y C son: " + diarioAC);
        System.out.println("La cantidad de suscriptores a los diarios A y B son: " + diarioAB);
        System.out.println("La cantidad de suscriptores a los diarios B y C son: " + diarioBC);
        System.out.println("La cantidad de suscriptores a solo un diario son: " + diario1);
        System.out.println("La cantidad de suscriptores solo al diario A son: " + diarioA);
        System.out.println("La cantidad de suscriptores solo al diario B son: " + diarioB);
        System.out.println("La cantidad de suscriptores solo al diario C son: " + diarioC);
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
    }
}