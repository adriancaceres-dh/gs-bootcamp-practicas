package clasesabstractaseinterfaces;

public abstract class Documento {
    protected Integer cantidadDePaginas;
    protected String nombreAutor;

    public Documento(){}

    public Documento(Integer cantidadDePaginas, String nombreAutor) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.nombreAutor = nombreAutor;
    }
}
