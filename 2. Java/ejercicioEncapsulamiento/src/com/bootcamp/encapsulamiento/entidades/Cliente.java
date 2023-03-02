package com.bootcamp.encapsulamiento.entidades;

public class Cliente extends Persona{

    private String numeroCliente;
    public Cliente(String nombre, String dni) {
        super(nombre,dni);
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre " + this.getNombre() +
                " numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public String enviarMensaje() {
        return "Enviar promociones";
    }

    @Override
    public void caminar() {
        System.out.println("Camina cliente " + this.numeroCliente);
    }

    /*@Override
    public boolean equals(Persona obj) {
//        return super.equals(obj);
        return this.getDni().equals(obj.getDni());
    }*/
}
