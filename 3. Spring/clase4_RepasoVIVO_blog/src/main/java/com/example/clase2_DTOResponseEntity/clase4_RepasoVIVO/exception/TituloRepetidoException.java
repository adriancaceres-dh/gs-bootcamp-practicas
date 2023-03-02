package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.exception;

public class TituloRepetidoException extends RuntimeException{

    public TituloRepetidoException(String mensaje) {
        super(mensaje); //Llama al runtime para completar el mesnaje cuando la lanzamos en el service.
    }
}
