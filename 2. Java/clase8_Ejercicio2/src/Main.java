import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Curriculum cv1 = new Curriculum("Luciano","Festa","36365939",31, Arrays.asList("Programación","Banca","Liderazgo"));
        Informe informe1 = new Informe(500,100,"Pepito Lopez","Viano Marcela");
        LibroPDF libro1 = new LibroPDF("Java", "Adrian Lopez","Informatica",50);

        Imprimir.imprimible(cv1);
        Imprimir.imprimible(informe1);
        Imprimir.imprimible(libro1);


    }
}