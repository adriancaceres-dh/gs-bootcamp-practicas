package EjercicioObjetos;

public class Persona{

    // Crear clase persona - Ejercicio 1
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// Creando constructores

    // Constructor sin parametros
    public Persona() {
    }

    // Constructor parámetro de nombre, edad, dno
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    // Calcular IMC de la persona
    public int calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20){
            return -1;
        } else if (imc >= 20 && imc < 25){
            return 0;
        } else {
            return 1;
        }
    }

    // Vemos si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Agrego el metodo toString() para devolver la información de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
