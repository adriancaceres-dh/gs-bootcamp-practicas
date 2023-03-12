package ejercicios.clasesabstractaseinterfaces.banco;

public class Main {
    public static void main(String[] args){


        //llamamos a la clase padre y creamos cualquiera de las opciones hijo
        Cliente ejecutivo1 = new Ejecutivos("Sofia", 39815208);
        System.out.println("--------------------------------------------");
        System.out.println(ejecutivo1.getNombre() + "es un ejecutivo y puede: ");
        ejecutivo1.tareasPermitidas();
        System.out.println("---------------------------------------");
        System.out.println("Pero no puede: ");
        ejecutivo1.tareasNoPermitidas();

        Cliente basic1 = new Basic("Gisela", 3345698);
        System.out.println("--------------------------------------------");
        System.out.println(basic1.getNombre() + "es un basic y puede: ");
        basic1.tareasPermitidas();
        System.out.println("---------------------------------------");
        System.out.println("Pero no puede: ");
        basic1.tareasNoPermitidas();


    }
}
