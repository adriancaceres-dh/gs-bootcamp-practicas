package Ej3_PlayG_ImprimirDocumento;

public class LibrosPdf extends Documento{

    private String titulo;
    private String genero;

    public LibrosPdf() {
    }


    public LibrosPdf(int cantidadPag, String nombreAutor, String titulo, String genero) {
        super(cantidadPag, nombreAutor);
        this.titulo = titulo;
        this.genero = genero;
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
        return "Ej3_PlayG_ImprimirDocumento.LibrosPdf{" + super.toString() + " " +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
