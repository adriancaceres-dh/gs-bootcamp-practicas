package com.bootcamp.aeroparque.entidades;

public class AvionCarga extends Aeronave implements Volador{

    private String capacidadMaxima;

    public AvionCarga(String bandera, int cantidadPasajeros, String capacidadMaxima) {
        super(bandera, cantidadPasajeros);
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avion carga");
    }

    @Override
    public void despegar() {
        System.out.println("Despegar avion carga, capaciad" + this.capacidadMaxima);
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizar ");
    }
}
