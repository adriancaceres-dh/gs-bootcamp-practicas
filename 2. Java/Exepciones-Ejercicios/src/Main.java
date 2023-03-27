import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

        public static void main(String[] args) {

            //Ejercicio1
            /*
            int a = 0;
            int b = 300;

            try {
                int cociente = b/a;
            } catch (ArithmeticException exception) {
                System.out.println("Se ha producido un error");
            } finally {
                System.out.println("Programa finalizado");
            }



            try {
                int cociente = b/a;
            } catch (ArithmeticException exception) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            } finally {
                System.out.println("Programa finalizado");
            }

             */
            //Ejercicio 2
            /*
            String mensajeFinal = "Este es el último mensaje";

            try {
                int[] numeros = new int[5];
                numeros[5] = 10;

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());

            } finally {
                System.out.println(mensajeFinal);
            }

             */


            //Ejercicio 3

            /*

            try {
                String texto = null;

                BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
                while((texto = bufferedReader.readLine()) != null) {
                    System.out.println(texto);
                }
                bufferedReader.close();

            }catch(FileNotFoundException exception){
                System.out.println("No se puede encontrar el archivo especificado.");
            }catch(IOException exception){
                System.out.println("Error al leer el archivo especificado");
            }

             */

            //Ejercicio 4

            /*
            public static int numeroMayor(int numero1, int numero2) {
                return Math.max(numero1, numero2);
            }

            public static int numeroMenor(int numero1, int numero2) {
                return Math.min(numero1, numero2);
            }

            public static double potencia(double numero, double potencia) {
                return Math.pow(numero, potencia);
            }

            public static double coseno(double angulo) {
                return Math.cos(angulo);
            }

            public static double raizCuadrada(double numero) {
                return Math.sqrt(numero);
            }

            public static int numeroAleatorio() {
                return (int) (Math.random() * 1000);
            }

             */



        }
    }
