import java.util.Scanner;

public class Ejercicio4Estrc {
    public static void main(String[] args) {


        int totalPersonas=0;
        int diarioA = 0, diarioB = 0, diarioC = 0, diarioAC = 0, diarioAB = 0, diarioABC = 0, diarioBC = 0;

        for (; totalPersonas<=9; ) {
            Scanner diario = new Scanner(System.in);
            System.out.println("Ingrese el diario al que esta suscripto: \n 1) Diario A \n 2) Diario B \n 3) Diario C \n 4) Diario AC \n 5) Diario AB \n 6) Diario ABC \n 7) Diario BC");
            int diarioElegido = diario.nextInt();
            totalPersonas++;
            if (diarioElegido == 1){
                diarioA++;
            } else if (diarioElegido == 2) {
                diarioB++;
            } else if (diarioElegido == 3) {
                diarioC++;
            } else if (diarioElegido == 4){
                diarioAC++;
            } else if (diarioElegido == 5) {
                diarioAB++;
            } else if (diarioElegido == 6) {
                diarioABC++;
            }else if (diarioElegido == 7) {
                diarioBC++;
            }
            else{
                System.out.print("No existe ese diario");
            }

        }
        System.out.println("Suscriptos a los 3 diarios: " + diarioABC + " personas");
        System.out.println("Suscriptos al diario A y C: " + diarioAC + " personas");
        System.out.println("Suscriptos al diario A y B: " + diarioAB + " personas");
        System.out.println("Suscriptos al diario B y C: " + diarioBC + " personas");
        System.out.println("Suscriptos al diario A " + diarioA + " personas");

    }
}
//public class ejercicio3 {
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printl("indique si se suscribio a diario A,diario B o diario C");
        String datosDiario= scanner.toString();

      String diarioA= "diario A";
        String diarioB ="diario B";
        String diarioc = "diario C";


        int cont=0;
        while(cont =< 10){
            String datos= scanner.toString();
            cont = cont+1;
            System.out.printl("datos ingresado con exito");

        if(diarioA){
            System.out.printl("suscripto a diarioA");
        }*/






