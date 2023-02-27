import com.bootcamp.documento.Curriculum;
import com.bootcamp.documento.Imprimible;
import com.bootcamp.documento.Informe;
import com.bootcamp.documento.LibroPdf;

public class Main {
    public static void main(String[] args) {
        Imprimible imprimible = new Curriculum();
        Imprimible.imprimir();
        Imprimible imprimible1 = new Informe();
        Imprimible.imprimir();
        Imprimible imprimible2 = new LibroPdf();
        Imprimible.imprimir();
    }
}