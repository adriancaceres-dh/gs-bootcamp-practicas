package Universidad;

public class profesores extends Persona implements EquipoDocente{
    @Override
    public void enseñar() {
        System.out.println("Dar el curso");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("Dar devoluciones");
    }
}
