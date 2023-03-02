public class LibrosPDF extends Documento implements Imprimible{
    private String titulo;
    private String genero;

    public LibrosPDF(){};

    public LibrosPDF(Integer cantidadDePaginas, String autor) {
        super(cantidadDePaginas, autor);
    }

    public Integer getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(Integer cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String nombreAutor) {
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
    public void imrpimir() {
        System.out.println("Libro en PDF impreso");
    }
}
