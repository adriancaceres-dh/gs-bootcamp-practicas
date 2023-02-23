package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;
import com.bootcamp.encapsulamiento.entidades.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos","34555"));
        personas.add(new Proveedor("Arcor","345325","dd"));

        for (Persona persona: personas ) {
            System.out.println(persona.enviarMensaje());
        }





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