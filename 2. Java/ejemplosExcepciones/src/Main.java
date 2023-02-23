public class Main {
    public static void main(String[] args) {
        // Sin el bloque try catch el sistema se corta.
        //int [] numeros1 = {3,5,8};
        //System.out.println(numeros1[3]);

        int j;
        try {
            int [] numeros1 = {3,5,8};
            System.out.println(numeros1[3]);
            j = 10/90;

        } catch(ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cerrar todo");
        }
        System.out.println("El sistema termina ok");

    }
}