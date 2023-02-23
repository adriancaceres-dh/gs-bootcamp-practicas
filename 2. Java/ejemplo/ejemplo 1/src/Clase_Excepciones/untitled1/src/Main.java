public class Main {
    public static void main(String[] args) {
        // Sin el bloque try/catch, el sistema se corta
        /*
        int[] numeros = {2,3,8};
        System.out.println(numeros[3]);
        */

        try {
            int j = 10 / 0;
        }  catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cerrar todo");
        }
        System.out.println("El sistema termina ok");
    }
}