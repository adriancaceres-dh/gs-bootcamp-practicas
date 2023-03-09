package com.digitalhouse.obtenerdiploma.excepciones;

public class NoSuffucientNoteExecption extends RuntimeException{
    public NoSuffucientNoteExecption() {
    }

    public NoSuffucientNoteExecption(String message) {
        super(message);
    }
}
