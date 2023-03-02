public class PracticaExcepciones {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int valor = b/a;
        } catch (Exception e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
            //System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }
    }

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
}
