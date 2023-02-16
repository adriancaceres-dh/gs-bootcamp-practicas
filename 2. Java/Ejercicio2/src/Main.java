import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ejercicio1
        /*
        double precioCosto;
        int fabrica;
        double fabrica1 = 0.07;
        double fabrica2 = 0.15;
        double fabrica3 = 0.22;
        double ganacia = 0.25;
        double precioVenta = 0;

        System.out.println("Ingrese precio Costo");
        precioCosto = scanner.nextDouble();

        System.out.println("Ingrese fabrica");
        fabrica = scanner.nextInt();

        while (fabrica > 3 && fabrica < 1) {
            System.out.println("No a ingresado un numero valido de farbica Reingreselo..");
            fabrica = scanner.nextInt();
        }
        switch (fabrica) {

            case 1:

                precioVenta = precioCosto + (precioCosto * fabrica1) ;
                precioVenta = precioVenta + (precioVenta * ganacia) ;
                break;

            case 2:

                precioVenta = precioCosto + (precioCosto * fabrica2) ;
                precioVenta = precioVenta + (precioVenta * ganacia) ;
                break;

            case 3:

                precioVenta = precioCosto + (precioCosto * fabrica3) ;
                precioVenta = precioVenta + (precioVenta * ganacia) ;
                break;

            default:

                break;

        }
        System.out.println("El precio de Venta es "+ precioVenta);
        */

        //Ejercicio2

        /*
        System.out.println("Ingrese precio Costo");
        int dni = scanner.nextInt();

        System.out.println("Ingrese fabrica");
        int monto = scanner.nextInt();

        double sueldo = 0;

        if(monto <= 20000){
            sueldo = monto+monto * 0.20;
        }else if(monto > 20000 && monto <= 45000){
            sueldo = monto+monto * 0.10;
        }else{
            sueldo = monto+monto * 0.05;
        }

        System.out.println("El sueldo del empleado "+dni+" es "+ sueldo);

         */

        //Ejercicio3
        /*
        int[] cliente = new int[6];
        for(int i = 0; i < 7; i++) {
            System.out.println("Ingrese servicio del cliente "+i+1);
            cliente[i] = scanner.nextInt();

            while (cliente[i] > 2 && cliente[i] < 1) {
                System.out.println("No a ingresado un servicio valido Reingreselo..");
                cliente[i] = scanner.nextInt();
            }

            if(cliente[i]==1){
                cliente[i] = 1500;
            }else{
                cliente[i] = 2200;
            }
        }
        for(int i = 0; i < 7; i++) {
            System.out.println("El cliente "+i+1+" debera abonar "+cliente[i]);
        }

         */

        //Ejercicio4
        /*
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int diarioAC = 0;
        int diarioAB = 0;
        int diarioABC = 0;
        int diarioBC = 0;
        int diarioSoloA = 0;

        for (int i = 0; i < 3; i++) {
            Scanner scannerSuscripcion = new Scanner(System.in);
            System.out.println("Ingrese el diario al que esta suscripto: \n 1) Diario A \n 2) Diario B \n 3) Diario C \n 4) Diario AC \n 5) Diario AB \n 6) Diario ABC \n 7) Diario BC");
            int diarioSuscripto = scannerSuscripcion.nextInt();

            if (diarioSuscripto == 1) {
                diarioSoloA++;
                diarioA++;
            } else if (diarioSuscripto == 2) {
                diarioB++;
            } else if (diarioSuscripto == 3) {
                diarioC++;
            } else if (diarioSuscripto == 4) {
                diarioA++;
                diarioC++;
                diarioAC++;
            } else if (diarioSuscripto == 5) {
                diarioAB++;
                diarioA++;
                diarioB++;
            } else if (diarioSuscripto == 6) {
                diarioABC++;
                diarioC++;
                diarioA++;
                diarioB++;
            } else if (diarioSuscripto == 7) {
                diarioBC++;
                diarioC++;
                diarioB++;
            } else {
                System.out.println("Ingresa una opción válida");
            }

        }
        System.out.println("Están suscriptos solo al diario A: " + diarioSoloA);
        System.out.println("Están suscriptos a los tres diarios: " + diarioABC);
        System.out.println("Están suscriptos al diario A y C: " + diarioAC);
        System.out.println("Están suscriptos al diario A y B: " + diarioAB);
        System.out.println("Están suscriptos al diario B y C: " + diarioBC);

        */

    }
}