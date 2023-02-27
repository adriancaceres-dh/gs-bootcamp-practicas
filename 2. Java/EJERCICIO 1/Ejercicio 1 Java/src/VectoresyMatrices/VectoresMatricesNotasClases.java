package VectoresyMatrices;

import java.util.Scanner;

public class VectoresMatricesNotasClases {
      /*
    public static void main(String[] args) {

      //Ejemplo en clase SWITCH

        System.out.println("menu");
        System.out.println("1-Altas 2-Bajas 3-Procesos 0-sale");
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        while(true){
            opcion= scanner.nextInt();
            switch (opcion) {
                    case 1:
                    System.out.println("altas");
                    break;
                    case 2:
                        System.out.println("bajas");
                        break;
                    case 3:
                        System.out.println("proceso");
                        break;
                    default:
                        System.out.println("opcion sin tarea en el sistema");
                        break;


            }
        }
        */

        //ARRAYS
    /*
        int [] numeros = {3,4,5,-2,4-8,5};
        //int positivos = 0;
        //int negativos = 0;
        System.out.println(numeros[4]);// dentro del cero podes poner distintos indice
        //System.out.println(numeros[5]);
        for (int i = 0; i < numeros.length; i++) {//para recorrer todos
            System.out.println(numeros[i]);
            if(numeros[i]>=0){
               positivos++;//para ver cuantos negativos y cuantos positvos hay
            }else{
               negativos++;//para ver cuantos negativos y cuantos positvos hay

            }

        }
      System.out.println("Hay estos numeros positivos " + positivos );
       System.out.println("Hay estos numeros negativos " + negativos );

   */

/*
        // ejemplo como String
        // se puede hacer tmb asi String [] nombres = ["juan,maria,tomas"];
        String [] nombres = new String[3];
        nombres[0]= "juan";
        nombres[1]= "maria";
        nombres[2]= "tomas";
        //System.out.println(nombres[2]); para imprimir 1

        for (int i = 0; i < nombres.length; i++) {//para recorrer todos
            System.out.println(nombres[i]);

        }

*/
        //MATRICES
/*
        int[][] numeros = {{4,6,8},{8,-3,2},{20,-3,-5}};
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println(numeros[i].length);//tamaño cada una de las filas osea hay 3 numeros en c/u
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " "); // para cuando lo imprime lo hace en la misma linea
            }
            System.out.println("");// permite que al imprimirse los numeros se separen
        }
*/
        // otro ejemplo
/*
        int[] legajo = {1, 2, 3, 4, 5};
        String[] empleados = {"vallejos", "pitton", "col", "podio"};
        int[] edad = {18, 20, 27, 50};

        // cuantos empleados hay?
        //System.out.println("hay esta cantidad de empleados : " + empleados.length);

        // cual es el empleado con edad entre 30 y 40?
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] >= 30 && edad[i] <= 40) {
                System.out.println("el empleado entre 30 y 40 años es : " + empleados[i]);

            }
        }

    }
    */
}
