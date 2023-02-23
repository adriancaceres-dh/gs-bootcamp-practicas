//Ejercicio 1
public class PracticaExcepciones {
    public static void main(String[] args) {
        //pto 1
        int a = 0;
        int b= 300;
        try {
            int cociente = b/a;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }

        //pto 2
        try {
            int cociente = b/a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
    }
