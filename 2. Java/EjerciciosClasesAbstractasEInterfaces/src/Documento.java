public abstract class Documento {
    protected Integer cantidadDePaginas;
    protected String autor;

    public Documento() {};

    public Documento(Integer cantidadDePaginas, String autor) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
    }
}
