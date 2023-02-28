public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println("Gato");
        System.out.println("--------------------------");
        gato.comerCarne();
        gato.EmitirSonido();


        Perro perro = new Perro();
        System.out.println("---------------------------");
        System.out.println("Perro");
        System.out.println("--------------------------");
        perro.comerCarne();
        perro.EmitirSonido();


        Vaca vaca = new Vaca();
        System.out.println("----------------------------");
        System.out.println("Vaca");
        System.out.println("---------------------------");
        vaca.ComerHierba();
        vaca.EmitirSonido();


        comerAnimal.comerAnimal(perro);
        comerAnimal.comerAnimal(gato);
        comerAnimal.comerAnimal(vaca);
    }
}