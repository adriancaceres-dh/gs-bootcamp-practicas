package com.digitalhouse.obtenerdiploma.exceptions;

public class NoSufficientNotesException extends RuntimeException{

    public NoSufficientNotesException() {
    }

    public NoSufficientNotesException(String message) {
        super(message);
    }
}
