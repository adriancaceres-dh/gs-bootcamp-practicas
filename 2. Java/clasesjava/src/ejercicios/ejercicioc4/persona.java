package ejercicios.ejercicioc4;
//EJERCICIO N° 1 --> crear la clase persona
public class persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

//EJERCICIO N° 2 --> crear constructores
    public persona(){} // sin parametros

    public persona(String nombre, String dni, int edad){ //parametro nombre, edad y dni
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public persona(String nombre, int edad, String dni, double peso, double altura) { //parametro todos los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

//EJERCICIO N° 5 --> creamos metodos
    public int calcularIMC(){
        double imc = peso / altura * altura;

        if(imc < 20){
            return -1;
        } else if (imc <= 25 ) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return edad > 18;
    }

    @Override // devuelve toda la info de la persona
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
