package com.bootcamp.encampsulamiento.entidades;

public abstract class Proveedor extends Persona{
    private String codigoProveedor;
    public Proveedor(String nombre, String dni) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }

   public String enviarMensaje(){
        return "Enviar una carta de recomendacion";
   }
}
