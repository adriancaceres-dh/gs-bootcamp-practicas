import java.util.ArrayList;
import java.util.List;

public class Bibloteca {
    String nombre;
    String direccion;
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "Bibloteca: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Direccion:'" + direccion + '\n';
    }

    public String listarLibros() {
        String listaLibros = " ";
        for (Libro libro: libros) {
            //System.out.println(libro.toString());
            listaLibros += libro + libro.toString() + "\n";
        }
        return listaLibros;
    }

}

