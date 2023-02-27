public class LibrosenPDF {
    private String cantidadDePaginas;
    private String nombreDelAutor;
    private String titulo;
    private String genero;

    public LibrosenPDF(String cantidadDePaginas, String nombreDelAutor, String titulo, String genero) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.nombreDelAutor = nombreDelAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LibrosenPDF{" +
                "cantidadDePaginas='" + cantidadDePaginas + '\'' +
                ", nombreDelAutor='" + nombreDelAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
