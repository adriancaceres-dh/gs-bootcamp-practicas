
//Ejercicio 1
public class Persona {

    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    //Ejercicio 2
    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
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
    public double calcularIMC() {
        double imc = peso/(Math.pow(altura,2));

        if(imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        return edad>=18;
    }

    @Override
    public String toString() {
        return "Persona: \n" +
                "nombre: " + nombre + '\n' +
                "dni: " + dni + '\n' +
                "peso: " + peso + '\n' +
                "altura: " + altura + '\n' +
                "edad: " + edad + '\n';
    }

}
