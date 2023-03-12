package ejercicios.clasesabstractaseinterfaces.impresora;

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Curriculum cv1 = new Curriculum("Sofia", "Gieco", 26, 39815208, Arrays.asList("Programacion", "Scrum", "Proactividad"));
        Informes informe1 = new Informes(100, 5, "Sofia Gieco", "Docente DH");
        LibroPDF libro1 = new LibroPDF(35,"Borges", "El Aleph", "General");

        Imprimir.imprimible(cv1);
        Imprimir.imprimible(informe1);
        Imprimir.imprimible(libro1);
    }
}
