package com.Sprint1.Sprint1.exception;

public class HotelNoEncontradoException extends RuntimeException {
    public HotelNoEncontradoException() {
        super("No se encontró ningún hotel.");
    }
}