public class EjerciciosClase {
    public static void main(String[] args) {


        try {
            int j = 10/1;
            int[] numeros={2,3,8};
            System.out.println();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("No se puede dividir por 0");
        }
        finally {
            System.out.println("Cerrar todo");
        }
        System.out.println("El sistema termina ok");



    }
}
