package com.bootcamp.personas;

import com.bootcamp.personas.GrupoPersonas;
import com.bootcamp.personas.Persona;

public class EjercicioClaseObjeto {
    public static void main(String[] args) {
        Persona persona = new Persona("Franco Ambort", 29, "37575676");
        Persona persona1 = new Persona("Pamela Abeldaño", 30, "35575676");
        Persona persona2 = new Persona("Valentina Vallejos", 26, "38575676");

        Persona persona3 = new Persona();
        persona3.nombre = "Franco Ambort";
        persona3.edad = 29;
        persona3.peso = 67.8;
        persona3.altura = 164;

        Persona persona4 = new Persona();
        persona4.nombre = "Pamela Abeldaño";
        persona4.edad = 30;
        persona4.peso = 67.8;
        persona4.altura = 164;

        Persona persona5 = new Persona();
        persona5.nombre = "Pepito";
        persona5.edad = 6;
        persona5.peso = 20;
        persona5.altura = 120;

        int imc = persona.calcularIMC();
        boolean mayorDeEdad = persona.esMayorDeEdad();
        GrupoPersonas grupoPersonas = new GrupoPersonas();

        grupoPersonas.agregarPersona(persona);
        grupoPersonas.agregarPersona(persona1);
        grupoPersonas.agregarPersona(persona2);
        grupoPersonas.agregarPersona(persona3);
        grupoPersonas.agregarPersona(persona4);
        grupoPersonas.agregarPersona(persona5);

        System.out.println(grupoPersonas.listarPersonas());
        System.out.println("La persona " + persona.nombre + ", y su imc es: " + imc );
        System.out.println("Es mayor de edad? " + mayorDeEdad);
    }
}
