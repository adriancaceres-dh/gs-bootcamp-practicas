public class ExprecionesLambda {

    private Integer dni1;
    private String nombre1;

    public ExprecionesLambda(Integer dni, String nombre) {
        this.dni1 = dni;
        this.nombre1 = nombre;
    }

    public Integer getDni() {
        return dni1;
    }

    public void setDni(Integer dni) {
        this.dni1 = dni;
    }

    public String getNombre() {
        return nombre1;
    }

    public void setNombre(String nombre) {
        this.nombre1 = nombre;
    }

    @Override
    public String toString() {
        return "ExprecionesLambda{" +
                "dni=" + dni1 +
                ", nombre='" + nombre1 + '\'' +
                '}';
    }
}
