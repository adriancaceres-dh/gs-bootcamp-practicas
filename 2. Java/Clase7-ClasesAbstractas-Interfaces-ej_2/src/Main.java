import com.bootcamp.entidades.Curriculum;
import com.bootcamp.entidades.Imprimible;
import com.bootcamp.entidades.Informe;
import com.bootcamp.entidades.LibroPDF;

public class Main {
    public static void main(String[] args) {

        Imprimible imprimible = new Curriculum();
        imprimible.imprimir();

        Imprimible imprimible1 = new Informe();
        imprimible1.imprimir();

        Imprimible imprimible2 = new LibroPDF();
        imprimible2.imprimir();



    }
}