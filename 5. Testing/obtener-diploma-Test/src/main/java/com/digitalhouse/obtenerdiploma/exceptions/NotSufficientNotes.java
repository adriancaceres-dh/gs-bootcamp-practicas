package com.digitalhouse.obtenerdiploma.exceptions;

public class NotSufficientNotes extends RuntimeException{


    //constructores: uno con parametro y uno que recibe como parametro el mensaje --automaticos desde generate--
    public NotSufficientNotes() {
    }


    public NotSufficientNotes(String message) {
        super(message);
    }
}
