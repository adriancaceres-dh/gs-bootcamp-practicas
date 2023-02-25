package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.ClienteEncapsulamiento;
import com.bootcamp.encapsulamiento.entidades.PersonaEncapsulamiento;
import com.bootcamp.encapsulamiento.entidades.ProveedorEncapsulamiento;

import java.util.ArrayList;
import java.util.List;

public class EjemploEncapsulamiento {
    public static void main(String[] args) {

        System.out.println(PersonaEncapsulamiento.cantidadCorazones);

       /* PersonaEncapsulamiento persona = new PersonaEncapsulamiento();

        persona.setNombre("Carlos");
        persona.setDni("29589345");
        List<PersonaEncapsulamiento> personas = new ArrayList<>();
        personas.add(new ClienteEncapsulamiento("Carlos","34555"));
        personas.add(new ProveedorEncapsulamiento("Arcor","345325","dd"));

        for (PersonaEncapsulamiento personaEncapsulamiento: personas ) {
            System.out.println(persona.enviarMensaje());
        }

        System.out.println(persona); */

        ClienteEncapsulamiento cliente = new ClienteEncapsulamiento("Juana", "30569845");

        cliente.setNumeroCliente("AET32");


        cliente.setNumeroCliente("234");
        cliente.caminar();
        System.out.println(cliente);
    }
}
