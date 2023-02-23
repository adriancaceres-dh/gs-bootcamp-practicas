package com.bootcamp.encapsulamiento.excepciones;

public class TickedPromoException extends Exception {

    private String mensaje;
    public TickedPromoException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
