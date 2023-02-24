package com.bootcamp.aeroparque.entidades;

public class AvionCarga extends Aeronave implements Volador {

    private String capacidadMaxima;

    public AvionCarga(String bandera, int cantidadPasajeros, String capacidadMaxima) {
        super(bandera, cantidadPasajeros);
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avión de carga");
    }

    @Override
    public void despegar() {
        System.out.println("Despegar avion de carga, capacidad " + this.capacidadMaxima);
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizaje avion de carga, capacidad " + this.capacidadMaxima);
    }
}
