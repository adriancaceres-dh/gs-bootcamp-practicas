import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticaExcepciones {

    public static void main(String[] args) {
        //ACTIVIDAD ANTES DE LA CLASE

        //EJECICIO 1

       /* int a = 0;
        int b = 300;
        try{
            int cociente = b / a;
        } catch(ArithmeticException exception){
            System.out.println("Se ha producido un error.");
        }finally{
            System.out.println("El programa ha finalizado.");
        }
        try{
            int cociente = b / a;
        }catch(ArithmeticException exception){
            throw new IllegalArgumentException("No se puede dividir un número por cero");
        }finally{
            System.out.println("El programa ha finalizado.");
        }*/


        //EJERCICIO 2

        /*String mensajeFinal = "Estes es el último mensaje";
        int[] numeros = new int[5];
        try{
            numeros[5] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Mensaje de error: " + exception.getMessage());
        }finally {
            System.out.println(mensajeFinal);
        }*/


        //EJERCICIO 3

        /*public void leerArchivo(String nombreArchivo) {
            String texto = null;
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        }catch(FileNotFoundException exception){
            System.out.println("No se puede encontrar el archivo especificado.");
        }catch(IOException exception){
            System.out.println("Error al leer el archivo especificado");
        }*/

    }
}