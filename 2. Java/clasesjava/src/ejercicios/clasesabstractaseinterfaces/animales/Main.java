package ejercicios.clasesabstractaseinterfaces.animales;

public class Main {
    public static void main(String[] args){

        Perro perro = new Perro("Poroto", "Mascota");
        Vaca vaca = new Vaca("Lola", "Produccion");
        Gato gato = new Gato("Thor", "Mascota");

        System.out.println("Sonido: " + perro.emitirSonido() + perro.comerCarne());
        System.out.println("Sonido: " + vaca.emitirSonido() + vaca.comerHierba());
        System.out.println("Sonido: " + gato.emitirSonido() + gato.comerCarne());


    }
}
