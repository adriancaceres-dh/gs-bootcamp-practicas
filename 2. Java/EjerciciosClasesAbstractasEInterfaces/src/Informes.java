public class Informes extends Documento implements Imprimible{
    private String texto;
    private String revisor;

    public Informes(){};

    public Informes(Integer cantidadDePaginas, String autor) {
        super(cantidadDePaginas, autor);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(Integer cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void imrpimir() {
        System.out.println("Informes impreso");
    }
}
