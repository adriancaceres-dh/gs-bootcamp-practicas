package com.bootcamp.encampsulamiento.entidades;

import com.bootcamp.encampsulamiento.entidades.excepciones.TicketPromoException;

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
        return "Cliente{" +
                "numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public void caminar() {

    }

    public boolean equals(Persona obj){
        return this.getDni().equals(obj.getDni());
    }

    @Override
    public void obtenerTicket() {
        try {
            Integer numero = Integer.parseInt(this.numeroCliente);
            System.out.println("Anular ticket numero: " + numero);
        } catch(Exception e) {
            //System.out.println("Se produjo un error");
            //throw new TicketPromoException("Se produjo un errpr");
        }
    }


    @Override
    public void anularTicker() {
        System.out.println("Anular ticket");
    }
}
