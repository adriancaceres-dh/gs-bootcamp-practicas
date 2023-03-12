package ejercicios.clasesabstractaseinterfaces.banco;

public abstract class Cliente {
    //atributos
    String nombre;
    Integer DNI;

    //constructor
    public Cliente(String nombre, Integer DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    //to String
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                '}';
    }

    //metodos
    public abstract void tareasPermitidas();
    public abstract void tareasNoPermitidas();

}
