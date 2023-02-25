package com.bootcamp.abstractaseinterfaces;

public abstract class Documento {
    private String tipo;

    public Documento(){}
    public Documento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
