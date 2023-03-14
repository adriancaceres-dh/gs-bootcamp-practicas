public class Biblioteca {
    List<crearClase.Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro: libros) {
            System.out.println(libro.toString());
        }
    }
}
