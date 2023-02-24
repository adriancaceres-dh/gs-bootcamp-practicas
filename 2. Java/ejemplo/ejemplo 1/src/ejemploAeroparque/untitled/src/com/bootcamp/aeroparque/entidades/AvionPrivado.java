package com.bootcamp.aeroparque.entidades;

public class AvionPrivado extends Aeronave implements Volador {

    private String confort; // 1 max, 2 medio

    public AvionPrivado(String bandera, int cantidadPasajeros, String confort) {
        super(bandera, cantidadPasajeros);
        this.confort = confort;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avión privado");
    }

    @Override
    public void despegar() {
        System.out.println("Despega avion privado con confort" + this.confort);
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion privado con confort" + this.confort);
    }
}
