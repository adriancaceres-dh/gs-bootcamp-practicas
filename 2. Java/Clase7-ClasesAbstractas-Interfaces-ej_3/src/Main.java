import com.bootcamp.entidades.*;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Toto","Rottweiler", 4);
        Vaca vaca = new Vaca("Teresa","Holstein", 4);
        Gato gato = new Gato("Garfield","Azul Ruso", 4);

        System.out.println(perro.emitirSonido() + " y " + perro.comerCarne());
        System.out.println(gato.emitirSonido() + " y " + gato.comerCarne());
        System.out.println(vaca.emitirSonido() + " y " + vaca.comerHierba());


        System.out.println(comerAnimal(perro));
        System.out.println(comerAnimal(gato));
        System.out.println(comerAnimal(vaca));
    }

    public static String comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            return ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Herbivoro) {
            return ((Herbivoro) animal).comerHierba();
        }
        return null;
    }
}