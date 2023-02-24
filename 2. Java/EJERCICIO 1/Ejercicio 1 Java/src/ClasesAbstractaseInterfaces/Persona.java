package ClasesAbstractaseInterfaces;

public abstract class Persona { // es abstracta porque no se va a usar no se instancia, se usa
   // se usa estudiantes o tutor
    // es el padre

    //las clases generan los objetos (los objetos son los que usan new)
    private String nombre;
    private String apellido;
    private int edad;
    // constructores, getters y setters


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
