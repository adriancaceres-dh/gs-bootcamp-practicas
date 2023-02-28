import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        System.out.println("El Perro hace" + perro.Sonido() + "y come" + perro.Carnivoro());
        System.out.println("El gato hace" + gato.Sonido() + "y come" + gato.Carnivoro());
        System.out.println("La vaca hace" + vaca.Sonido() + "y come" + vaca.comerHierba());



        public static String comerAnimal(Animal Object animal) {
       /*     if (animal instanceof Carnivoro) {
                return ((Carnivoro) animal).comerCarne();
            } else if (animal instanceof Hervivoro) {
                return ((Hervivoro) animal).comerHierba();
            }
            return null;
        }*/

    }

}