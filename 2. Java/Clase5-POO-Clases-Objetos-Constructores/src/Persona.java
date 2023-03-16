public class Persona {
    //Ejercicio 1: crear una clase Persona con atributos:nombre, edad,
    // dni (en este caso vamos a representarlo como una cadena de caracteres), peso y altura
    String nombre;
    int edad;
    String DNI;
    double altura;
    double peso;

    //Ejercicio 2: crear diferentes constructores en la clase Persona, uno sin parámetros,
    // el segundo debe recibir como parámetro nombre, edad y dni;
    // creamos un tercero que reciba todos los atributos de la clase como parámetro.

    public Persona() {
    }
    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;

    }

    public Persona(String nombre, int edad, String DNI, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }

    //Ejercicio 5: calcularIMC(), la fórmula para calcularlo es: peso/(altura^2)
    //valor menor que 20, la función debe retornar -1,
    //número entre 20 y 25 inclusive para los dos valores, debe retornar un 0
    //número mayor que 25 debe retornar un 1

    public double calcularIMC() {
        double IMC = peso / (Math.pow(altura, 2));

        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    //el método esMayorDeEdad() debe retornar un valor booleano a partir de los 18 años

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // método toString() que va a devolver toda la información de la persona.
    @Override
    public String toString() {
        return "Persona {" +
                " nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

