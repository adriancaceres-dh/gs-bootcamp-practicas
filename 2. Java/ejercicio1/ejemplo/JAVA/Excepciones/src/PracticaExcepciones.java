//Ejercicio 1 pto 1 y 2
public class PracticaExcepciones {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 300;
            int cociente = b/a;
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error");
        } catch(ArithmeticException e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally{
            System.out.println("Programa Finalizado");
        }
    }
}
