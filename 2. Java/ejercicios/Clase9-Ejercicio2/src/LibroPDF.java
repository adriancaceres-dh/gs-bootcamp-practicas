public class LibroPDF implements Imprimir {
    int cantidadDePaginas;
    String autor;
    String titulo;
    String genero;

    public LibroPDF(int cantidadDePaginas, String autor, String titulo, String genero) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LibroPDF{" +
                "cantidadDePaginas=" + cantidadDePaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo libro: " + this.titulo);
    }
}
