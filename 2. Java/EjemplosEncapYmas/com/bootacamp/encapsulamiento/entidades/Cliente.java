package com.bootacamp.encapsulamiento.entidades;


//EXTENCION DE LA CLASE PERSONA, PARA TRAER SU INFO
public class Cliente extends Persona {

    public Cliente(String nombre, String dni) {
        super(nombre, dni);
    }


    @Override
    public String enviarMensaje() {
        return "Enviar mensaje cliente";
    }
}

