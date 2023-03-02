package com.bootcamp.EjercicioObtenerDiploma.excepciones;

public class AlumnoException extends RuntimeException{

    private String mensaje;
    public AlumnoException(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }
}