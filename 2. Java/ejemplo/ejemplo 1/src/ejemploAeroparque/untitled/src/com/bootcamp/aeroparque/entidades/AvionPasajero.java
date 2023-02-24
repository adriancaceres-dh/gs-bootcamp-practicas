package com.bootcamp.aeroparque.entidades;

public class AvionPasajero extends Aeronave implements Volador {
    private String cantidadAzafatas;

    public AvionPasajero(String bandera, int cantidadPasajeros, String cantidadAzafatas) {
        super(bandera, cantidadPasajeros);
        this.cantidadAzafatas = cantidadAzafatas;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio piloto en avión de pasajeros");
    }

    @Override
    public void despegar() {
        System.out.println("Despega avion de pasajeros con " + this.cantidadAzafatas + " azafatas");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion de pasajeros con " + this.cantidadAzafatas + " azafatas");
    }
}
