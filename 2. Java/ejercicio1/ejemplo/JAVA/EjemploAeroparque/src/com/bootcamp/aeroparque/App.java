package com.bootcamp.aeroparque;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejemplo aeroparque");
        // avion privado   --   avion de pasajeros -- avion carga

        Aeroparque aeroparque = new Aeroparque();
        aeroparque.administrarAeronaves(new AvionCarga("Arg",3,"5T"));
        aeroparque.administrarAeronaves(new AvionPasajeros("Chi",5,""));

        aeroparque.despeganNaves();

    }
}