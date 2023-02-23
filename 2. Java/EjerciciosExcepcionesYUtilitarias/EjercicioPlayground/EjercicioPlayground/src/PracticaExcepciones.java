public class PracticaExcepciones {

    public static void main(String[] args) {
        //Ejercicio 1
        int a = 0;
        int b = 300;

        //Punto 1
        try {
            int calculo = b/a;
        } catch (ArithmeticException exception) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }


        //Punto 2
        try {
            int calculo = b/a;
        } catch (ArithmeticException exception) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }

}
