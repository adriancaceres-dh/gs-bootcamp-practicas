package clasesabstractaseinterfaces;

public class Main {
    public static void main(String[] args) {

        Imprimible imprimible = new Curriculums();
        imprimible.imprimir();

        Imprimible imprimible1 = new Informes();
        imprimible1.imprimir();

        Imprimible imprimible2 = new LibrosenPDF();
        imprimible2.imprimir();



    }
}