package com.glubits.employees.exception;

public class CouldNotDeleteException extends RuntimeException{

    public CouldNotDeleteException() {
    }

    public CouldNotDeleteException(String message) {
        super(message);
    }
}
