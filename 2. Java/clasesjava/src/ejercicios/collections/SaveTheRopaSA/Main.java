package ejercicios.collections.SaveTheRopaSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Save The Ropa");
        System.out.println("---------------------------------------------------------");

        //creamos nuevos productos
        Prenda prenda = new Prenda("Adidas","UltraBoost");
        Prenda prenda1 = new Prenda("Nike", "AirMax");

        Prenda prenda2 = new Prenda("John Fos", "Negras");
        Prenda prenda3 = new Prenda("Rebook", "Running");


        //los agregamos a nuestra lista --> que sigue la clase Prenda
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);

        List<Prenda> prendas1 = new ArrayList<>();
        prendas1.add(prenda2);
        prendas1.add(prenda3);


        //creamos un nuevo guardaropa --> con los atributos de la clase GuardaRopa y usando el metodo guardarPRendas las agregamos al MAP
        GuardaRopa miGuardaRopa = new GuardaRopa();
        miGuardaRopa.guadarPrendas(prendas);
        miGuardaRopa.guadarPrendas(prendas1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Indicanos que ID queres ver");
        int id = sc.nextInt();

        System.out.println("---------------------------------------------------------");

        //mostramos en consola la lista segun el id que pongamos
        System.out.println("El id seleccionado corresponde a esta lista " + miGuardaRopa.devolverPrenda(id));



    }
}
