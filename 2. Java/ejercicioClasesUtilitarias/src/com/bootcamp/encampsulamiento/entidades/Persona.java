package com.bootcamp.encampsulamiento.entidades;

public abstract class Persona {
    public static int cantidadCorazones = 1;
    private String nombre;
    private String dni;

    public Persona(){};

    public Persona(String nombre, String dni){
        this.nombre = dni;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "com.bootcamp.encampsulamiento.entidades.Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    public String enviarMensaje(){
        return "Esta es una persona";
    }

    public abstract void caminar();

}

