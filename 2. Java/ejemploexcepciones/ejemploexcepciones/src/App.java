import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El programa termina ok");

    }
}
