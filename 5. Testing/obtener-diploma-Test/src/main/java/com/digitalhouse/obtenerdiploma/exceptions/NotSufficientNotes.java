package com.digitalhouse.obtenerdiploma.exceptions;

public class NotSufficientNotes extends RuntimeException{


    public NotSufficientNotes() {
    }

    public NotSufficientNotes(String message) {
        super(message);
    }
}
