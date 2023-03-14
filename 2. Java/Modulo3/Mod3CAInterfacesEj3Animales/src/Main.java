import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija uno de estos animales: gato - perro o vaca");
        String sonido=gato.setSonido();;
        String AnimalElegido = scanner.next(sonido);



        Gato gato1 = new Gato();
        gato1.setSonido();
        gato1.ComerCarne();
        System.out.println(gato1);


        Perro perro1= new Perro();
           perro1.setSonido();
        System.out.println();


        Vaca vaca1 = new Vaca();
        vaca1.setSonido();
        System.out.println();


    }
}