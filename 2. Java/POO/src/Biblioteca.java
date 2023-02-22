import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String listarLibros() {
        String listaLibros = "";
        for (Libro libro: libros) {
            listaLibros = listaLibros +libro.toString();
            //System.out.println(libro.toString());
        }return listaLibros;
    }
}
