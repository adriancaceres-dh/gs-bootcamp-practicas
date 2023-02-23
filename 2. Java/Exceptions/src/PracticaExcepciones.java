import java.util.*;
import java.io.*;

public class PracticaExcepciones {

    public static void main(String[] args) {

        //int a = 0;
        //int b = 300;

        //ejercicio 1

        /* try {
            int j = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }*/

       /* try {
             int j = b / a;
        } catch (IllegalArgumentException e) {
           throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }*/
        //-------------------------------------------------------------------

        //Ejercicio 2

        /*try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("Este es el último mensaje");
        }*/
        //-------------------------------------------------------------------

        //Ejercicio 3

    /*public void leerArchivo(String nombreArchivo) {
        String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }*/


    }

}

