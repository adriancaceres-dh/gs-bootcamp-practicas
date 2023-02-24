package ClasesAbstractaseInterfaces;

import java.util.Arrays;

public class MainCvLibroInformes {
    public static void main(String[] args){

        Curriculums curriculums = new Curriculums();
        Curriculums CV0 =new Curriculums("Juan", "Podio", Arrays.asList("Programación", "Diseño gráfico"));
        Impresora.imprimible(curriculums);



    }
}
