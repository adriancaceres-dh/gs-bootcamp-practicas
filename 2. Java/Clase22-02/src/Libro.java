public class Libro {

    String titulo;
    String autor;
    String editorial;

    public Libro() {}
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String tituloyAutorDelLibro() {
        return "Titulo: " + titulo + ", Autor: " + autor
                + ", Editorial: " + editorial;
    }

    @Override
    public String toString() {
        return "{Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Editorial='" + editorial + '\'' +
                '}';
    }
}
