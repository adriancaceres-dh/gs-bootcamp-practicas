package entidades;

public class EstudianteTecnico extends Estudiante implements EquipoTecnico{

    public void colaborar(){
        System.out.println("Colabora con las tareas de soporte tecnico");
    }

    @Override
    public void darSoporteTecnico() {
        System.out.println("Dar soporte tecnico");
    }
}
