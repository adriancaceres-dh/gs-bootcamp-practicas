package com.bootcamp.personas;

public class Persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public Persona(){}

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


    /*
    En la clase com.bootcamp.personas.Persona implementaremos los siguientes métodos: calcularIMC(),
    la fórmula para calcularlo es: peso/(altura^2) - (peso expresado en kg y altura en mts)
    */
    public int calcularIMC() {
        double imc = peso/(Math.pow(altura, 2));
        if(imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <=25) {
            return 0;
        } else {
            return 1;
        }
    }

    /*
    agreguemos el método esMayorDeEdad() el cual debe retornar una valor booleano,
    teniendo en cuenta que la mayoría de edad será considerada en este caso, a partir de los 18 años.
    */
    public boolean esMayorDeEdad() {

        if(edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "com.bootcamp.personas.Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
