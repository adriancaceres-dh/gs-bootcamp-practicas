package com.bootcamp.encapsulamiento.entidades;

public class Proveedores {
    private String codigoProveedor;

    public Proveedores(String nombre, String dni, String codigoProveedor) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }

    @Override
    public String enviarMensaje() {
        return "Enviar email con una carta de recomendacion";
    }
}
