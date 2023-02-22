public class Libro {

    String titulo;
    String autor;

    String editorial;

    public String tituloYautorDelLibro() {
        return "Titulo " + titulo + " autor " + autor;
    }

    public Libro(){};
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';

    }

}
