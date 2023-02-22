public class Libro {
    String titulo;
    String autor;
    String editorial;

    public String tituloAutor(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nEditorial: " + editorial;

    }

    public  Libro(){}
    public Libro(String titulo, String autor, String editorial){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    @Override
    public String toString() {
        return "Libro: " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

}
