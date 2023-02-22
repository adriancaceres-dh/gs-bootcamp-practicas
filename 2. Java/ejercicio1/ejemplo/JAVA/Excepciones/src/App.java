import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//no nos deja hacer codigo hasta que no usemos la estructura try- catch
public class App {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("archivos.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El programa termina ok");
    }
}