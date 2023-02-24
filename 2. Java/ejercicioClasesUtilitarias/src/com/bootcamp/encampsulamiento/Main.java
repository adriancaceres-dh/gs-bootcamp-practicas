package com.bootcamp.encampsulamiento;

import com.bootcamp.encampsulamiento.entidades.Cliente;
import com.bootcamp.encampsulamiento.entidades.Persona;
import com.bootcamp.encampsulamiento.entidades.Proveedor;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Con los metodos de la interface TicketPromo
        Cliente cliente = new Cliente("Pedro", "12481");
        cliente.obtenerTicket();

        /*
     Cliente cliente = new Cliente("Pablo", "182412");
     cliente.setNumeroCliente("128491");
     cliente.caminar();

     Cliente cliente1 = new Cliente("Pablo", "182412");
     cliente.setNumeroCliente("128491");

        System.out.println(cliente == cliente1);
        Cliente cliente2 = cliente;
        System.out.println(cliente2 == cliente);


        System.out.println(Persona.cantidadCorazones);
    List<Persona> personas = new ArrayList<>();
    personas.add(new Cliente("Carlos", "239721"));
    personas.add(new Proveedor("Arcor", "1412"));

    for (Persona persona: personas){
        System.out.println(persona.enviarMensaje());
    }
        Persona persona = new Persona();
        persona.setDni("12512");
        persona.setNombre("Juan");
        System.out.println(persona.toString());
        Cliente cliente = new Cliente("Pedro", "281941");
        System.out.println(cliente.toString());
   */
    }

}