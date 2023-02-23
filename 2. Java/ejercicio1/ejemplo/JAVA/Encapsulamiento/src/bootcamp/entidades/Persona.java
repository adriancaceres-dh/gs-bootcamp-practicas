package bootcamp.entidades;

public class Persona {
    public static int cantidadDeCorazones = 1;
    private String nombre;              //como buena practica deberian ir privados los atributos de las clases
    private String dni;

    public Persona(){}  //Constructor (siempre publico para que lo pueda llamar en el main)
    public  Persona (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override                                        //si tengo que sobreescribir
    public String toString() {
        return "bootcamp.entidades.Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

