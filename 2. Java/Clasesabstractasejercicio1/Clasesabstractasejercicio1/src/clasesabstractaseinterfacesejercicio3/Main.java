package clasesabstractaseinterfacesejercicio3;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Felipe", "Domestico");
        Vaca vaca = new Vaca("Clota", "Pastoreo");
        Gato gato = new Gato("Chatran", "Domestico");


        System.out.println("Sonido: " + perro.emitirSonido() + "!!!" + perro.comerCarne());
        System.out.println("Sonido: " + vaca.emitirSonido() + "!!!" + vaca.comerHierba());
        System.out.println("Sonido: " + gato.emitirSonido() + "!!!" + gato.comerCarne());

    //no supe como hacer el metodo comer animal//
    }

}