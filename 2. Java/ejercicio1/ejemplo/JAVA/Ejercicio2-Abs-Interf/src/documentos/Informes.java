package documentos;

import documentos.Imprimible;

public class Informes extends Documentos implements Imprimible {
    private int longitudTexto;

    private String revisor;

    public Informes(int longitudTexto, int cantidadPaginas, String autor, String revisor) {
        this.longitudTexto = longitudTexto;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public int getLongitudTexto() {
        return longitudTexto;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setLongitudTexto(int longitudTexto) {
        this.longitudTexto = longitudTexto;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "documentos.Informes{" +
                "longitudTexto=" + longitudTexto +
                ", cantidadPaginas=" + cantidadPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
