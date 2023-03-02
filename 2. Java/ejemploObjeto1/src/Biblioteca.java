import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    String direccion;
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

//    public void listarLibros() {
//        for (Libro libro: libros) {
//            System.out.println(libro.toString());
//        }
//    }
    public String listarLibros() {
        String listaLibros = "";
        for (Libro libro: libros) {
            listaLibros = listaLibros + libro.toString() + "\n";
        }
        return listaLibros;
    }
}