package bootcamp.entidades;

public class Persona {

    public final int cantidadCorazones = 1;
    private String nombre;

    private String dni;

    public Persona() {}

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "bootcamp.entidades.Persona{" +
                "cantidadCorazones=" + cantidadCorazones +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

}
