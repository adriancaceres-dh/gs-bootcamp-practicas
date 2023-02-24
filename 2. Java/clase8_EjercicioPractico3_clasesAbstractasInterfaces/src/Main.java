public class Main {
    public static void main(String[] args) {

        Animal perro = new Perro("Poroto","Mascota");
        Animal vaca = new Vaca("Lola","Producción");
        Animal gato = new Gato("Muñi","Mascota");

        Carnivoro.comerCarne(perro);
        perro.emitirSonido();

        Hervivoro.comerHierba(vaca);
        vaca.emitirSonido();

    }
}