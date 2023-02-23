package POO;

public class PersonaPooEjercicios {
    //Ejercicio 1
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    //Ejercicio 2

    public PersonaPooEjercicios(){};
    public PersonaPooEjercicios(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }


    public PersonaPooEjercicios(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    /*public int sumarNumeros(int n1, int n2){
        this.
    }*/


    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    public boolean esMayorDeEdad() {
       if(edad >=18){
           return true;
       }else {
           return false;
       }
    }

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
