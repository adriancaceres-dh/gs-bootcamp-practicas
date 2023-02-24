package ClasesAbstractaseInterfaces;

public class Profesor extends MiembroPersonal {
    private String especialidad;

    public Profesor(String nombre, String apellido, int edad, String cargo, String especialidad) {
        super(nombre, apellido, edad, cargo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
