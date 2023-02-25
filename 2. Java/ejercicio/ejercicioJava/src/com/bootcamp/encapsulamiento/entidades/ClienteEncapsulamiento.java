package com.bootcamp.encapsulamiento.entidades;

public class ClienteEncapsulamiento extends PersonaEncapsulamiento{

    private String numeroCliente;
    public ClienteEncapsulamiento(String nombre, String dni) {
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
        return "ClienteEncapsulamiento{" + "nombre" + this.getNumeroCliente() +
                "numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public String enviarMensaje() {
        return "Enviar email con promociones";
    }

    @Override
    public void caminar() {
        System.out.println("camina cliente" + this.numeroCliente);
    }
}
