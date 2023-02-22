import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    String nombre;

    String direccion;
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String listarLibros() {
        String listaLibros = "";
        for (Libro libro: libros) {
            // System.out.println(libro.toString());
            listaLibros = listaLibros + libro.toString();
        }
        return listaLibros;
    }
