package teoria.teoriac4;
import java.util.List;
import java.util.ArrayList;
public class Biblioteca {
    String nombre;
    String direccion;
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) { // metodo para agergar un libro a la biblioteca
        libros.add(libro);
    }

    public void listarLibros() { // metodo para mostrar cada libro en un objeto
        for (Libro libro: libros) {
            System.out.println(libro.toString());
        }
    }

}
