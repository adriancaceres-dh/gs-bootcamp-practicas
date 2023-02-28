public class LibroPDF implements Imprimir, DocImprimible{
    private String titulo;
    private String autor;
    private String genero;
    private int cantidadPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public LibroPDF(String titulo, String autor, String genero, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "LibroPDF{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir el LibroPDF");
    }
}
