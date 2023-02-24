package com.bootcamp.aeroparque.entidades;

public abstract class Aeronave implements Volador {
    private String bandera; // de que país es
    private int cantidadPasajeros;
    private String piloto;

    public Aeronave(String bandera, int cantidadPasajeros) {
        this.bandera = bandera;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public abstract void cambiarPiloto(String cambioPiloto);
}
