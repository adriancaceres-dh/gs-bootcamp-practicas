import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Curriculums curriculums = new Curriculums();
        Informes informes = new Informes();
        LibrosPDF librosPDF = new LibrosPDF();

        Curriculums CV0 = new Curriculums("Aye", "Curetti", Arrays.asList("paciencia","constancia","perserverancia"));

       // Scanner imprimirDoc = new Scanner(System.in);
        //System.out.println("¿Que desea imprimir?");


        Impresora.imprimible(curriculums);
        //System.out.println();
    }
}