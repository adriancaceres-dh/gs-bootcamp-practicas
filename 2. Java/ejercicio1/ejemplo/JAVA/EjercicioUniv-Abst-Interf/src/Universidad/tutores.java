package Universidad;

public class tutores extends estudiantes implements  EquipoDocente{
    public void enseñar(){
        System.out.println("El tutor es un estudiante que enseña");
    }

    @Override
    public void darDevoluciones() {

    }
}
