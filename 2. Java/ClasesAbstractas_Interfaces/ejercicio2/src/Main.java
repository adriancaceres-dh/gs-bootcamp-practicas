import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibrosPdf libro = new LibrosPdf(300, "J. K. Rowling", "Harry Potter", "Ficción");
        Curriculum cv = new Curriculum("Martin", "Maine", 20, Arrays.asList("Javascript", "Css", "Html", "Java (en proceso)"));
        Informes informe = new Informes("Hola soy un informe", 55, "Juan Gomez", "Don Pepe");

        libro.imprimirDocumento();
        cv.imprimirDocumento();
        informe.imprimirDocumento();

    }
}