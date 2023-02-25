package teoria.poo;

public class Libro {
    String titulo;
    String autor;
    String editorial;

    public String tituloYAutorDelLibro(){
        return "Titulo " + titulo + " autor " + autor;
    }

    @Override
    public String toString() { //crea un objeto literal con los datos
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
