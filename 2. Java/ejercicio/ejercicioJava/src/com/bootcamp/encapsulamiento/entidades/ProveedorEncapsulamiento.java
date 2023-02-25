package com.bootcamp.encapsulamiento.entidades;

public class ProveedorEncapsulamiento extends PersonaEncapsulamiento {
    private String codigoProveedor;

    public ProveedorEncapsulamiento(String nombre, String dni, String codigoProveedor) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }



    @Override
    public String enviarMensaje() {
        return "Enviar email con una carta de recomendacion";
    }

    @Override
    public void caminar() {
        System.out.println("camina proveedor" + this.codigoProveedor);
    }

}
