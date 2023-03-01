package ClasesAbstractaseInterfaces.Ejercicio1;

public class Estudiante extends Persona {
    private int codigoEstudiante;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
}
