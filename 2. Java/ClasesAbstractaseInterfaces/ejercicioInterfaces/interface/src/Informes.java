public class Informes {
    private String autor;
    private String revisor;
    private String textoDeLongitud;
    private int cantidadDePaginas;

    public Informes(String autor, String revisor, String textoDeLongitud, int cantidadDePaginas) {
        this.autor = autor;
        this.revisor = revisor;
        this.textoDeLongitud = textoDeLongitud;
        this.cantidadDePaginas =  (int) Math.ceil(textoDeLongitud.length() / 1000.0);;
    }

    @Override
    public String toString() {
        return "Informes{" +
                "autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", textoDeLongitud='" + textoDeLongitud + '\'' +
                ", cantidadDePaginas=" + cantidadDePaginas +
                '}';
    }
}
