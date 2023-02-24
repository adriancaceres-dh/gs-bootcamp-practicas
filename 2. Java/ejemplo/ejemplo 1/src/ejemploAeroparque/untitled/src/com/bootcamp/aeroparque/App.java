package com.bootcamp.aeroparque;

import com.bootcamp.aeroparque.entidades.Aeroparque;
import com.bootcamp.aeroparque.entidades.AvionCarga;
import com.bootcamp.aeroparque.entidades.AvionPasajero;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejemplo aeroparque");
        // Avion privado -- Avion de pasajeros -- Avion de carga

        Aeroparque aeroparque = new Aeroparque();
        aeroparque.administrarAeronaves(new AvionCarga("Arg",3, "5000"));
        aeroparque.administrarAeronaves(new AvionPasajero("Arg",250, "10"));

        aeroparque.despeganNaves();
    }
}
