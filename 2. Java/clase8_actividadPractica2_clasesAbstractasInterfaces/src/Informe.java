public class Informe implements Imprimir{
    private int cantidadPalabras;
    private int cantidadPaginas;
    private String revisor;
    private String autor;

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Informe(int cantidadPalabras, int cantidadPaginas, String revisor, String autor) {
        this.cantidadPalabras = cantidadPalabras;
        this.cantidadPaginas = cantidadPaginas;
        this.revisor = revisor;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "cantidadPalabras=" + cantidadPalabras +
                ", cantidadPaginas=" + cantidadPaginas +
                ", revisor='" + revisor + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
