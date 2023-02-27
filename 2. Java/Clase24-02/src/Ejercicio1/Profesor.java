package Ejercicio1;

public class Profesor extends Persona implements EquipoDocente {


    @Override
    public void ensenar() {
        System.out.println("Dar el contenido");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("Dar devoluciones");
    }
}
