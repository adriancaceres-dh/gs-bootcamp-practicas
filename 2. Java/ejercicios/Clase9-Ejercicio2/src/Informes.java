public class Informes implements Imprimir {

    String texto;
    int cantidadDePaginas;
    String autor;
    String revisor;

    public Informes(String texto, int cantidadDePaginas, String autor, String revisor) {
        this.texto = texto;
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informes{" +
                "texto='" + texto + '\'' +
                ", cantidadDePaginas='" + cantidadDePaginas + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo informe de: " + this.autor);
    }
}
