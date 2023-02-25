public class Main{
    public static void main(String[] args) {

        Perro perro = new Perro("Poroto","Mascota");
        Vaca vaca = new Vaca("Lola","Producción");
        Gato gato = new Gato("Muñi","Mascota");

        System.out.println("Sonido: " + perro.emitirSonido() + "!!! " + perro.comerCarne());

        System.out.println("Sonido: " + gato.emitirSonido() + "!!! " + gato.comerCarne());

        System.out.println("Sonido: " + vaca.emitirSonido() + "!!! " + vaca.comerHierba());

        System.out.println(comerAnimal(perro));
        System.out.println(comerAnimal(gato));
        System.out.println(comerAnimal(vaca));
    }

    public static String comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            return ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Hervivoro) {
            return ((Hervivoro) animal).comerHierba();
        }
        return null;
    }
}

