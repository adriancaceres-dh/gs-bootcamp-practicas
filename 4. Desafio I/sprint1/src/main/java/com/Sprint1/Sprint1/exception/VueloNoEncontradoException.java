package com.Sprint1.Sprint1.exception;

public class VueloNoEncontradoException extends RuntimeException {
    public VueloNoEncontradoException() {
        super("No se encontró ningún vuelo.");
    }
}
