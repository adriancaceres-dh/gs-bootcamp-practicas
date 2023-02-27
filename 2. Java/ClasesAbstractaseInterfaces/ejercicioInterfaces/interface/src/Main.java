import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Programación en Java");
        habilidades.add("Diseño gráfico");


        Curriculums curriculum = new Curriculums("Juan", "Pérez", 25, habilidades.get(0));
        LibrosenPDF libro = new LibrosenPDF("344", "J.K. Rowling", "Harry Potter y la piedra filosofal", "accion");
        Informes informes = new Informes("Nicolas", "Matias ", "333", 244 );
        Imprimible.imprimir(curriculum);
        Imprimible.imprimir(libro);
        Imprimible.imprimir(informes);



    }
    }
