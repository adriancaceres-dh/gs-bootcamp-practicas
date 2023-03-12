package ejercicios.clasesabstractaseinterfaces.animales;

public abstract class Animal {
    private String nombre;
    private String tipo;

    public Animal(){

    }

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //metodo de sonidos
    public String emitirSonido(){
        return "Sonido";
    }

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

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
