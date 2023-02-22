import java.util.ArrayList;
import java.util.List;

public class Blibioteca {
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
            listaLibros = listaLibros + libro.toString() + "\n";
        }
        return listaLibros;
    }


    }

