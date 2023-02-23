package ExcepcionesyClasesUtilitarias;
//Ejercicio 1

 public class PracticaExcepciones {

    int a = 0;
    int b = 300;



    public void calcularCociente() {
     try {
            int cociente = b / a;
            System.out.println("El cociente es: " + cociente);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");


        }



        try {
            int cociente = b / a;
            System.out.println("El cociente es: " + cociente);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }



    }

}




