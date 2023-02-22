package com.bootcamp;

public class Main {

    //Ejercicio 3
    public static void main(String[] args) {

        //Ejercicio 4

        Persona persona = new Persona();
        Persona persona1 = new Persona("Marcela", 22, "38552125");
        Persona persona2 = new Persona("Fabian", 30, "32112542", 80, 1.80);

        //Constructor que no se puede resolver ya que no está definido en la clase - Ejercicio 4
        //Persona persona3 = new Persona("Gabriela", 20);

        //Ejercicio 6

        int imc = persona2.calcularIMC();

        if (imc == -1) {
            System.out.println("Se encuentra con bajo peso");
        } else if (imc == 0) {
            System.out.println("Tiene un peso saludable");
        } else if (imc == 1) {
            System.out.println("Se encuentra con sobrepeso");
        }

        boolean esMayor = persona2.esMayorDeEdad();

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Los datos de la persona son: " + persona2.toString());
    }

}
