package com.bootcamp.aeroparque;

public class AvionPrivado extends Aeronave{

    private String confort; //1 max - 2 medio

    public AvionPrivado(String bandera, int cantPasajeros, String confort) {
        super(bandera, cantPasajeros);
        this.confort = confort;
    }


    public AvionPrivado(String bandera, int cantPasajeros) {
        super(bandera, cantPasajeros);
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {

    }

    @Override
    public void despegar() {

    }

    @Override
    public void aterrizar() {

    }
}
