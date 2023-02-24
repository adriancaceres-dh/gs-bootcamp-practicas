import com.bootcamp.clasesAbstractas.Curriculums;
import com.bootcamp.clasesAbstractas.Imprimible;
import com.bootcamp.clasesAbstractas.Informes;
import com.bootcamp.clasesAbstractas.LibrosEnPdf;

public class Main {
    public static void main(String[] args) {

        Imprimible imprimible = new Curriculums();
        imprimible.imprimir();

        Imprimible imprimible1 = new Informes();
        imprimible1.imprimir();

        Imprimible imprimible2 = new LibrosEnPdf();
        imprimible2.imprimir();
            }
}