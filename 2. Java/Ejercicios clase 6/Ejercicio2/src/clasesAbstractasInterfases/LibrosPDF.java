package clasesAbstractasInterfases;

public class LibrosPDF extends Documento implements Imprimible{
    private String titulo;
    private String genero;

    public LibrosPDF(String cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }

    public LibrosPDF() {
        super();
    }

    @Override
    public void imprimir() {
    System.out.println("Imprimir libro en pdf");
}

}
