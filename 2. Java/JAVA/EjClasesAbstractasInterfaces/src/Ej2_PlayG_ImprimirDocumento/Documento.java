package Ej3_PlayG_ImprimirDocumento;

public abstract class Documento {
    private int cantidadPag;
    private String nombreAutor;

    public Documento() {
    }

    public Documento(int cantidadPag, String nombreAutor) {
        this.cantidadPag = cantidadPag;
        this.nombreAutor = nombreAutor;
    }

    public int getCantidadPag() {
        return cantidadPag;
    }

    public void setCantidadPag(int cantidadPag) {
        this.cantidadPag = cantidadPag;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "Ej3_PlayG_ImprimirDocumento.Documento{" +
                "cantidadPag=" + cantidadPag +
                ", nombreAutor='" + nombreAutor + '\'' +
                '}';
    }
}
