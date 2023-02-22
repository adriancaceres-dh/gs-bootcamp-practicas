public class Libro {

    String titulo;
    String autor;
    String editorial;

    public String tituloYautorDelLibro() {
        return " Titulo " + titulo + " autor " + autor;
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


