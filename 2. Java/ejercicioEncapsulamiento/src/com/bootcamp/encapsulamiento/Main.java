package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;
import com.bootcamp.encapsulamiento.entidades.Proveedor;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("juan", "3456462");
        cliente.setNumeroCliente("345345");
        cliente.caminar();

        Cliente cliente1 = new Cliente("Juan", "2345");
        cliente.setNumeroCliente("345345");

        System.out.println(cliente == cliente1);

        Cliente cliente2 = cliente;
        cliente2.setNombre("Pedro");
        System.out.println(cliente2 == cliente);
        System.out.println(cliente.getNombre());

        System.out.println(cliente2.getClass());

        /*System.out.println(Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("26245927");

        System.out.println(persona);

        Cliente cliente = new Cliente("Juana", "546546");
        cliente.setNumeroCliente("A65814");

        System.out.println(cliente);*/

        /*List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos", "34650741"));
        personas.add(new Proveedor("ARCOR", "465466546", "AB216514"));

        for (Persona persona: personas) {
            System.out.println(persona.enviarMensaje());
        }*/
    }
}