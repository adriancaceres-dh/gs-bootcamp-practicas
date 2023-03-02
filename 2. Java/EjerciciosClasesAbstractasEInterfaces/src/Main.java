import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Curriculums cv1 = new Curriculums();

        Imprimible imprimible = new Curriculums();
        imprimible.imrpimir();

        Imprimible imprimible1 = new Informes();
        imprimible1.imrpimir();

        Imprimible imprimible2 = new LibrosPDF();
        imprimible2.imrpimir();
    }
}