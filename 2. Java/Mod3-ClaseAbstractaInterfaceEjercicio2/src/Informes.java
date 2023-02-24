public class Informes implements DocumentoImprimible {
    private int longitud;

    private int paginas;

    private String autor;

    private String revisor;

    public Informes(){};

    @Override
    public String toString() {
        return "Informes{" +
                "longitud=" + longitud +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Se ha impreso el informe");
    }
}
