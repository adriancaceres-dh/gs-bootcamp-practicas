package entidades;

public class Persona {

    public final int cantidadCorazones = 1;
    private String nombre;

    private String dni;

    public Persona() {}


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
        return "entidades.Persona{" +
                "cantidadCorazones=" + cantidadCorazones +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
