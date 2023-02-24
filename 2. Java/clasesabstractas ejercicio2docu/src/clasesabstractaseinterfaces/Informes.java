package clasesabstractaseinterfaces;

import org.w3c.dom.ls.LSOutput;

public class Informes extends Documento implements Imprimible{

    private String texto;

    private String revisor;

    public Informes(){}

    public Informes(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }


    @Override
    public void imprimir() {

        System.out.println("imprimir informes");

    }


}
