package documentos;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Informes informe = new Informes(200,1500,"Borges","Miranda");
        Curriculums curriculums = new Curriculums("Enzo","Chiosso","35222425","23", Arrays.asList("Estudiante","Deportista"));
        LibroPDF libro = new LibroPDF("Cien Años de Soledad","Gabriel Garcia Marquez","Romance",350);


        Imprimible.imprimible(informe);
        Imprimible.imprimible(curriculums);
        Imprimible.imprimible(libro);
    }
}