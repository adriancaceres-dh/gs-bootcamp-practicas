package Ej3_PlayG_ImprimirDocumento;

public class Informes extends Documento {
    private String texto;
    private String revisor;

    public Informes(String texto, int i) {
    }

    public Informes(int cantidadPag, String nombreAutor, String texto, String revisor) {
        super(cantidadPag, nombreAutor);
        this.texto = texto;
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Ej3_PlayG_ImprimirDocumento.Informes{" +
                "texto='" + texto + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
