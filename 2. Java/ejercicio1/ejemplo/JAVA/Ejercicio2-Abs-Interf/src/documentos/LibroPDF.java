package documentos;

import documentos.Imprimible;

public class LibroPDF extends Documentos implements Imprimible {  //extends es porque creo una class abstracta
    private String titulo;

    private String genero;

    public LibroPDF(String titulo, String autor, String genero, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "documentos.LibroPDF{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }
}
