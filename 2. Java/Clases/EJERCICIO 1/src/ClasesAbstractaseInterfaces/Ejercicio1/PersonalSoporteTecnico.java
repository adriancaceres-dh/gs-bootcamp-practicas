package ClasesAbstractaseInterfaces.Ejercicio1;

public class PersonalSoporteTecnico extends Persona implements EquipoTecnico{

    public PersonalSoporteTecnico(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void darSoporteTecnico() {

    }

    @Override
    public void colaborar() {

    }
}
