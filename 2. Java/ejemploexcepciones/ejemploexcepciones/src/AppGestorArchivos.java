import java.io.FileNotFoundException;

public class AppGestorArchivos {
    public static void main(String[] args) {

        GestorArchivos gestorArchivos = new GestorArchivos();
        try {
            gestorArchivos.leerArchivo();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
