public class Main {
    public static void comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Herviboro) {
            ((Herviboro) animal).comerHierba();
        } else {
            System.out.println("No se puede determinar el tipo de alimentación del animal");
        }
    }
    public static void main(String[] args) {

        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();

        perro1.emitirSonido();
        perro1.comerCarne();

        System.out.println("\n---------------");

        gato1.emitirSonido();
        gato1.comerCarne();

        System.out.println("\n---------------");

        vaca1.emitirSonido();
        vaca1.comerHierba();

        System.out.println("\n---------------");
        System.out.println("Implementacion método comer animal:");

        comerAnimal(gato1);
        comerAnimal(perro1);
        comerAnimal(vaca1);
    }
}