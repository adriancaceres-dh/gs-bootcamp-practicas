import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class PracticaExcepciones {
    public static void main(String[] args) throws IllegalAccessException {
        int a = 0;
        int b = 300;
        int div;
        // Ejercicio 1:
        try {
            div = b / a;
        } catch (ArithmeticException e) {
            // throw new IllegalAccessException("No se puede dividir por 0");
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            System.out.println("Se ha producido un error " + e.getLocalizedMessage());
        }
        System.out.println("Programa finalizado");
        System.out.println("Fin de ejercicio 1.");
        System.out.println("-------------------------------------------");
        // Ejercicio 2


        String mensajeFinal = "Este es el último mensaje";
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(mensajeFinal);
    }

    public void leerArchivo(String nombreArchivo) {
        String texto = "hola";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("No se puede encontrar el archivo especificado.");
        } catch (IOException exception) {
            System.out.println("Error al leer el archivo especificado.");
        }

    }
}
