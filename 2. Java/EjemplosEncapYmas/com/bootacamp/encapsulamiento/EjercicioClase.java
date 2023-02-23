package com.bootacamp.encapsulamiento;

import com.bootacamp.encapsulamiento.entidades.Cliente;
import com.bootacamp.encapsulamiento.entidades.Persona;
import com.bootacamp.encapsulamiento.entidades.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class EjercicioClase {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos", "4434343"));
        personas.add(new Proveedor("Arcor", "14342344", "AS312312"));

        for (Persona persona: personas){
            System.out.println(persona.enviarMensaje());
        }

        System.out.println("Cantidad de corazones: "+ Persona.cantidadCorazones);

        Persona persona = new Persona();

        persona.setNombre("Salvador");
        persona.setDni("40221345");

        System.out.println(persona);

        Cliente cliente = new Cliente("Juana", "283451");


    }
}
