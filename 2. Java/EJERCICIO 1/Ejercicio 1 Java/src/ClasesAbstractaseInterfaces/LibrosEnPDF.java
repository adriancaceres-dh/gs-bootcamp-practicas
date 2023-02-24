package ClasesAbstractaseInterfaces;

public class LibrosEnPDF implements Impresora{
    private int cantidadPaginas;
    private String autor;
    private String titulo;
    private String genero;
    private String contenido;

    public LibrosEnPDF(int cantidadPaginas, String autor, String titulo, String genero, String contenido) {
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.contenido = contenido;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "LibrosEnPDF{" +
                "cantidadPaginas=" + cantidadPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }

    public LibrosEnPDF() {
    }


    @Override
    public void imprimir() {

    }
}
