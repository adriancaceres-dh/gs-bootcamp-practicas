package ClaseAbstracta;

public class Main {
    public static void main(String[] args) {

        Perro perrito = new Perro("Arturo", "Mascota");
        Gato gatito = new Gato("Otto","Mascota");
        Vaca vaca= new Vaca("Lola", "Campo");

        System.out.println("El perro hace: " + perrito.emitirSonido() + "! " + perrito.comeCarne());

        System.out.println("El gato hace: " + gatito.emitirSonido() + "! " + gatito.comeCarne());

        System.out.println("La vaca hace: " + vaca.emitirSonido() + "! " + vaca.comeHierva());

        System.out.println(comerAnimal(perrito));
        System.out.println(comerAnimal(gatito));
        System.out.println(comerAnimal(vaca));
    }

    public static String comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            return ((Carnivoro) animal).comeCarne();
        } else if (animal instanceof Hervivoro) {
            return ((Hervivoro) animal).comeHierva();
        }
        return null;
    }
    }
