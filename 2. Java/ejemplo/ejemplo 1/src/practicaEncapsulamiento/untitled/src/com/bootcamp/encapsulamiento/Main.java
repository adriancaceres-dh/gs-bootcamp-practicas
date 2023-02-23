package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;
import com.bootcamp.encapsulamiento.entidades.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Josesito", "200123123"));
        personas.add(new Proveedor("Liliano", "12434312", "dd"));

        for (Persona persona: personas) {
            System.out.println(persona.enviarMensaje());
        }

        System.out.println("Cantidad de corazones " + Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("3990990");

        System.out.println("El nombre de la persona es " + persona.getNombre() + " con DNI " + persona.getDni());

        Cliente cliente = new Cliente("Stefano", "38136376");
        cliente.setNumeroCliente("10");

        System.out.println("El nombre del cliente es " + cliente.getNombre() + " con numero de cliente " + cliente.getNumeroCliente());
    }
}