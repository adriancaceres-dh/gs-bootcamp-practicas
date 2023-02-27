public class Main {
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
    }
}