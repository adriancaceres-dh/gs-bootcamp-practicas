package com.Sprint1.Sprint1.exception;

public class SinParametrosException extends RuntimeException {
    public SinParametrosException() {
        super("Ingrese los parámetros requeridos.");
    }
}
