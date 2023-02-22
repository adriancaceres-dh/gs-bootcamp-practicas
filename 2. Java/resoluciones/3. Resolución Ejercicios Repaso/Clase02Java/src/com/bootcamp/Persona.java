package com.bootcamp;

public class Persona {
    //No está mal si no indican modificador de acceso
    // ya que es un tema que todavía no vimos
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    //Hasta aquí Ejercicio 1


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

    /**
     * Calcula el índice de masa corporal
     * @return código numérico
     * -1: la persona tiene bajo peso
     * 0: la persona tiene un peso saludable
     * 1: la persona tiene sobrepeso
     */
    public int calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Indica si la persona es mayor de edad
     * @return true si es mayor de edad y false si es menor de edad
     */
    public boolean esMayorDeEdad() {
        return edad > 18;
    }

    /**
     * Devuelve información sobre la persona
     * @return String con toda la información de sus atributos
     */
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
