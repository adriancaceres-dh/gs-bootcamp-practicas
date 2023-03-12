package ejercicios.clasesabstractaseinterfaces.impresora;

public class Informes implements Imprimir{
    //atributos
    private Integer cantidadDePalabras;
    private Integer cantidadDePaginas;
    private String autor;
    private String revisor;

    //metodo vacio y sin parametros
    public Informes(){

    }
    //constructor
    public Informes(Integer cantidadDePalabras, Integer cantidadDePaginas, String autor, String revisor) {
        this.cantidadDePalabras = cantidadDePalabras;
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    //getter and setter
    public Integer getCantidadDePalabras() {
        return cantidadDePalabras;
    }

    public void setCantidadDePalabras(Integer cantidadDePalabras) {
        this.cantidadDePalabras = cantidadDePalabras;
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
    public String toString() {
        return "Informes{" +
                "cantidadDePalabras=" + cantidadDePalabras +
                ", cantidadDePaginas=" + cantidadDePaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    @Override
    public void Imprimir(){
        System.out.println("Imprimir el Informe");
    }
}
