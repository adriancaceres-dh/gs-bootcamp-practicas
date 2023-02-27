import com.bootcamp.interfaz.Curriculums;
import com.bootcamp.interfaz.Imprimible;
import com.bootcamp.interfaz.Informes;
import com.bootcamp.interfaz.LibrosEnPDF;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Imprimible imprimible = new Curriculums();
        imprimible.imprimir();
        System.out.println("------------------------------");
        Imprimible imprimible1 = new Informes();
        imprimible1.imprimir();
        System.out.println("------------------------------");
        Imprimible imprimible2 = new LibrosEnPDF();
        imprimible2.imprimir();

        
    }
}