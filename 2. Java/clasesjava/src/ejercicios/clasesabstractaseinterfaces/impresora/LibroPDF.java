package ejercicios.clasesabstractaseinterfaces.impresora;

public class LibroPDF implements Imprimir{
    //atributos
    private Integer cantidadDePaginas;
    private String autor;
    private String titulo;
    private String genero;

    //metodo vacio y sin parametros

    public LibroPDF(){

    }

    //constructor
    public LibroPDF(Integer cantidadDePaginas, String autor, String titulo, String genero) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }


    //getters and setters
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LibroPDF{" +
                "cantidadDePaginas=" + cantidadDePaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public void Imprimir(){
        System.out.println("Imprimir el LibroPDF");
    }
}
