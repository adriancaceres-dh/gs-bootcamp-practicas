package com.bootcamp.encapsulamiento.entidades;

import com.bootcamp.encapsulamiento.excepciones.TickedPromoException;

public class Cliente extends Persona implements TicketPromo{

    private String numeroCliente;
    public Cliente(String nombre, String dni) {
        super(nombre, dni);
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente {" + "nombre " + this.getNombre() + " " +
                "numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public String enviarMensaje() {
        return "Enviar email con promociones";
    }

    @Override
    public void caminar() {
        System.out.println("Camina cliente " + this.numeroCliente);
    }


    public boolean equals(Persona obj) {
        return this.getDni().equals(obj.getDni());
    }

    @Override
    public void obtenerTicket() throws TickedPromoException {
        try {
            Integer numero = Integer.parseInt(this.numeroCliente);
        } catch (Exception e) {
            // System.out.println("Se produjo un error");
            throw new TickedPromoException("Se produjo un error con el numero de cliente");
        }
        System.out.println("Obtener ticket");
    }

    @Override
    public void anularTicket() {
        System.out.println("Anular ticket");
    }
}
