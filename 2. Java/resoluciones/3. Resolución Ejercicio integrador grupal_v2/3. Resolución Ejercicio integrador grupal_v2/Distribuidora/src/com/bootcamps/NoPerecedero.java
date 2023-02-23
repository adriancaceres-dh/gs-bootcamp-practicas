package com.bootcamps;

/**
 * Clase NoPerecedero, clase hija o subclase de Producto
 */
public class NoPerecedero extends Producto {

    //Atributo
    private String tipo;

    //Constructor
    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    //Métodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + '}';
    }

}
