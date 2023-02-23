package com.bootcamps;


public class Producto {

    //Atributos
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio +", ";
    }


    public double calcular(int cantidadDeProductos){

        return precio*cantidadDeProductos;
    }
}
