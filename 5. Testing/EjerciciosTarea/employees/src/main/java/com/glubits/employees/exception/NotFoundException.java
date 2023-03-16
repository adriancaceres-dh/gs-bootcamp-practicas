package com.glubits.employees.exception;

import com.glubits.employees.utils.enums.CrudEnum;

public class NotFoundException extends RuntimeException{

    CrudEnum action;

    public NotFoundException() {
    }

    public NotFoundException(String message, CrudEnum action) {
        super(message);
        this.action = action;
    }
}
