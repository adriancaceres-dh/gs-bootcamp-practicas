package com.bootcamp.encapsulamiento.entidades;

public class Proveedor extends Persona{

    private String codigoProveedor;

    public Proveedor(String nombre, String dni, String codigoProveedor) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }

    @Override
    public String enviarMensaje() {
        return "Enviar una carta de recomendacion";
    }

    @Override
    public void caminar() {
        System.out.println("Camina proveedor " + this.codigoProveedor);
    }
}
