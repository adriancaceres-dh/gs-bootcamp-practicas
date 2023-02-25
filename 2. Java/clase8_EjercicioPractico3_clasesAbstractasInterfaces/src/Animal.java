public abstract class Animal {
    private String nombre;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal() {
    }

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public abstract String emitirSonido();


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
