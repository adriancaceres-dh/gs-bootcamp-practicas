import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EjemplosExceptions {

    public static void main(String[] args) {
      /*  try {
            int j = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cerrar todo");
        }
        System.out.println("El sistema termina ok");
    }*/

        try {
            FileInputStream fileInputStream = new FileInputStream("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El programa termina ok");
    }
}
