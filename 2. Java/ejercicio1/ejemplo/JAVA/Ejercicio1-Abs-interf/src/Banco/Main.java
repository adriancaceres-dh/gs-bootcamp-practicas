package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cobrador = new Cobradores ("Jesica","Miranda","35222425");

        System.out.println(cobrador.getNombre() + " es un cobrador y esta habilitado a: ");
        cobrador.tareasPermitidas();
        System.out.println("No esta habilitado a las siguientes operaciones: ");
        cobrador.tareasNoPermitidas();
    }
}