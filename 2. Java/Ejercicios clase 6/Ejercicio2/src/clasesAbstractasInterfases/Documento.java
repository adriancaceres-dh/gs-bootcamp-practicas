package clasesAbstractasInterfases;

public abstract class Documento {
    protected String cantidadDePaginas;
    protected String nombreAutor;

    public Documento(String cantidadDePaginas, String nombreAutor) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.nombreAutor = nombreAutor;
    }

    public Documento() {

    }
}
