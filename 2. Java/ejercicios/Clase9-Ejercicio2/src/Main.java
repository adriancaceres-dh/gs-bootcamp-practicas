import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>persona1 = new ArrayList<>();
        persona1.add("Mateo");
        persona1.add("DNI: 123123123");
        persona1.add("Habilidad: Imprimir documentos");

        // Curriculum cv = new Curriculum(persona1);
        // Informes informe = new Informes("Este es un informe", 23, "Pedro", "Jose");
        // LibroPDF pdf = new LibroPDF(10, "John", "How to print", "Tutorial");

        Imprimir imprimir = new Curriculum(persona1);
        Imprimir imprimir1 = new Informes("Este es un informe", 23, "Pedro", "Jose");
        Imprimir imprimir2 = new LibroPDF(10, "John", "How to print", "Tutorial");
        imprimir.imprimir();
        imprimir1.imprimir();
        imprimir2.imprimir();
    }
}