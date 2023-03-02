package clasesAbstractasInterfases;

public class Informes implements  Imprimible{

    private String texto;

    private String revisor;

    @Override
    public void imprimir() {
        System.out.println("Imprimir informe");
    }

}
