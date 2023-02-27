public class LibrosPdf implements Imprimible{
    private int CantidadPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public LibrosPdf(int cantidadPaginas, String autor, String titulo, String genero) {
        CantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return CantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        CantidadPaginas = cantidadPaginas;
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

    @Override
    public String toString() {
        return "LibrosPdf {" +
                "CantidadPaginas =" + CantidadPaginas +
                ", autor ='" + autor + '\'' +
                ", titulo ='" + titulo + '\'' +
                ", genero ='" + genero + '\'' +
                '}';
    }

    @Override
    public void imprimirDocumento() {
        System.out.println(toString());
    }
}
