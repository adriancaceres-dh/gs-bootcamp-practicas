package Universidad;

public class estudiantesTecnicos extends estudiantes implements EquipoTecnico{
    public void colaborar(){
        System.out.println("Hcae las tareas con soporte tecnico");
    }

    @Override
    public void darSoporteTecnico() {

    }
}
