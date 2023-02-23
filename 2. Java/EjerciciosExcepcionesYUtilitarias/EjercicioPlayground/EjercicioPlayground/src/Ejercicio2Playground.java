import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    //Ejercicio 2
public class Ejercicio2Playground{
    public static void main(String[] args) {
        //Ejercicio 2

        String mensajeFinal = "Este es el último mensaje";

        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(mensajeFinal);
        }
    }

   //Ejercicio 3
    public void leerArchivo(String nombreArchivo) {
        String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo especificado");
        }
    }

}
