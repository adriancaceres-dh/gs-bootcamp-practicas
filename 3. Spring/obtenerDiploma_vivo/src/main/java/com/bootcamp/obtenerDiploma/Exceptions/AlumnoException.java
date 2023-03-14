package com.bootcamp.obtenerDiploma.Exceptions;

public class AlumnoException extends RuntimeException{

    private String mensaje;
    public AlumnoException(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
