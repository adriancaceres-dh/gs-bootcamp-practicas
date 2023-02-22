//Ejercicio 1
public class Persona {  //las clases siempre empiezan con mayusculas
    String nombre;
    int edad;

    String dni;

    double peso;
    double altura;

    //Ejercicio 2
    public Persona() {  // el constructor siempre tiene el mismo nombre que la clase
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;  //this se usa cuando la clase y el constructor son iguales
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    //Ejercicio 5

    /*Calcula el índice de masa corporal*/
    public int calcularIMC() {
        double imc = peso / altura * altura;
        if(imc < 20){
           return -1;
        } else if (imc < 25){
            return 0;
        } else{
            return 1;
        }
    }
    /* Indica si la persona es mayor de edad*/
    public boolean esMayorDeEdad(){return edad >= 18;}

    /*Información de la persona*/
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

