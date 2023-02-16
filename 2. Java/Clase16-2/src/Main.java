//Clase vectores y matrices de 16/02 T.T

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        --------------------------Caso Switch----------------------------
        System.out.println("menu");
        System.out.println("1-Altas, 2-Bajas, 3-Procesos, 0-Sale");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        while(true) {
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Altas");
                    break;
                case 2:
                    System.out.println("Bajas");
                    break;
                case 3:
                    System.out.println("Proceso");
                    break;
                default:
                    System.out.println("Opcion sin tarea en el sistema");
                    break;
            }
        }*/


     /*   --------------------------------Ejemplo vector---------------------------------------------
        int[] numeros= {3,4,5,-2,4,-8,5}; //System.out.println(numeros[4]);
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                positivo++;
            } else {
                negativo++;
            }
        }
            System.out.println("hay " + positivo + " numeros positivos");
            System.out.println("hay " + negativo + " numeros negativos");


        String[] nombres1 = {"Pamela", "Matias", "Ximena"};
        System.out.println(nombres1[1]);
        String[] nombres = new String[3];
        nombres[0] = "Pamela";
        nombres[1] = "Matias";
        nombres[2] = "Ximena";
        System.out.println(nombres[2]);*/



        /*-----------------------------------Ejemplo matriz--------------------------------

        int[][] numeros = {{4,6,8},{8,3,7},{20,-3,-5}};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");


        }   */



        /*------------------------------------------------------------------

        int[] legajo = {1,2,3,4};
        String[] empleados = {"Gomez", "Fernandez", "Rodriguez", "Case"};
        int[] edad = {16,23,38,45};

        //Cuantos empleados hay?
        System.out.println("Hay " + empleados.length + " empleados");
        //Cual es el empleado con edad entre 30 y 40?

        for (int i = 0; i < edad.length; i++){
            if(edad[i] >= 30 && edad[i] <= 40){
                System.out.println("El empleado entre 30 y 40 años es " + empleados[i]);
            }
        } */
    }
}


