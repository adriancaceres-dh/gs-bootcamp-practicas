package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Gato g1 = new Gato();
        g1.setSonido("Miau1");

        Gato g2 = new Gato();
        g2.setSonido("Miau1");

        System.out.println(g1.equals(g2));

        Gato g3 = g1;
        System.out.println(g3.equals(g1));

        g3.setSonido("Nuevo sonido");

        System.out.println(g1.getSonido());
        System.out.println(g3.getSonido());


    }
    public static String comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Herviboro) {
            ((Herviboro) animal).comerHierba();
        }
        return "";
    }
}