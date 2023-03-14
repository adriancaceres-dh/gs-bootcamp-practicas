public class Main {
    public static void main(String[] args) {
        try {
            int j = 10/0;
            String nombre = null;
            System.out.println(nombre.toLowerCase());
        }catch (ArithmeticException e){
            System.out.println("no es posible dividir por cero");
    }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cerrar archivos");
        }
        System.out.println("El sistema termina ok");


       // System.out.println(j);
        System.out.println("el sistema termina ok");
    }
}