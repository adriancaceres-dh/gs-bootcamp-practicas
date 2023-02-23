package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;
import com.bootcamp.encapsulamiento.entidades.Proveedor;
import com.bootcamp.encapsulamiento.excepciones.TickedPromoException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // con los métodos de la interface TicketPromo
        Cliente cliente = new Cliente("Pedro","34");
        try {
            cliente.obtenerTicket();
        } catch (TickedPromoException e) {
            System.out.println(e.getMensaje());
        }


        /*
        Cliente cliente = new Cliente("Juan","2345");
        cliente.setNumeroCliente("345345");
        cliente.caminar();

        Cliente cliente1 = new Cliente("Juan","2345");
        cliente1.setNumeroCliente("345345");
        System.out.println(cliente == cliente1);

        Cliente cliente2 = cliente;
        cliente2.setNombre("Pedro");
        System.out.println(cliente2 == cliente);
        System.out.println(cliente.getNombre());

        System.out.println(cliente2.getClass());
        */


        // Polimorfismo
        /*
        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos","34555"));
        personas.add(new Proveedor("Arcor","345325","dd"));

        for (Persona persona: personas ) {
            System.out.println(persona.enviarMensaje());
        }

         */


        /*
        System.out.println("Cantidad de corazones " + Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("452345");

        System.out.println(persona);

        Cliente cliente = new Cliente("Juana","634564");
        cliente.setNumeroCliente("A35345");
        System.out.println(cliente);

        */




    }
}