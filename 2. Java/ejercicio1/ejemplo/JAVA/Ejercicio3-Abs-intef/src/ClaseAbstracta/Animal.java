package ClaseAbstracta;

public abstract class Animal {
    private String nombre;
    private String tipoAnimal;

    public Animal(String nombre, String tipoAnimal) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public abstract String emitirSonido();
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                '}';
    }
}
