//Ejercicio N° 2
package ejercicios.excepcionesycu;

public class PracticaExcepciones2 {
    public static void main(String[] args){

        //mensaje final
        String mensajeFinal = "Este es el último mensaje";

        try {
            int[] numeros = new int[5];
            numeros[5]= 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println(mensajeFinal);
        }


    }
}
