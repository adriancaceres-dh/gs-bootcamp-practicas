package com.bootcamp.encapsulamiento.excepciones;

public class TicketPromoException extends Exception {
    private String mensaje;
    public TicketPromoException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
