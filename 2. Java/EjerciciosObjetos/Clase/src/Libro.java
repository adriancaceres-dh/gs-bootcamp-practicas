public class Libro {
    String titulo;
    String autor;

    public String tituloYautorDelLibro(){
        return "Titulo: "+titulo+" de: "+autor;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
}
