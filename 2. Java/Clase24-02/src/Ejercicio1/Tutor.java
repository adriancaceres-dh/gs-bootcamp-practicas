package Ejercicio1;

public class Tutor extends Estudiante implements EquipoDocente {

    public void ensenar() {
        System.out.println("El tutor es un estudiante que ensena");
    }

    @Override
    public void darDevoluciones() {

    }
}
