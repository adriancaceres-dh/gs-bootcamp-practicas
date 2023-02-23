package ExcepcionesyClasesUtilitarias;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjerciciosPlaygroundExcepcionesYClasesUtilitarias {

    public static void main(String[] args) {
        /*
        String mensajeFinal = "Este es el último mensaje";
        int[] numeros = new int[5];
        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
        System.out.println(mensajeFinal);
    }


     */
    /*
    public void leerArchivo(String nombreArchivo) {
        String texto = null;
        //forma 2 metodo lance una excepcion
        BufferedReader BufferedReader = new BufferedReader(new FileReader(nombreArchivo));

        //forma 1:
        /*BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + nombreArchivo + " no se ha encontrado.");
        } catch (IOException e) {
            System.err.println("Se ha producido un error de lectura del archivo " + nombreArchivo);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("Se ha producido un error al cerrar el archivo " + nombreArchivo);
            }
        }

*/
    }


}
