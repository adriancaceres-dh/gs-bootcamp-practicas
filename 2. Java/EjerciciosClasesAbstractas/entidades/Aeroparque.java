package entidades;

import java.util.ArrayList;
import java.util.List;

public class Aeroparque implements Volador{

    private List<Aeronave> aeronaves = new ArrayList<>();

    public void administrarAeronaves(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public void despeganNaves(){ // FALTA COMPLETAR
        for (Aeronave aeronave:aeronaves) {
        aeronave.despegar();
        }
    }

    @Override
    public void despegar() {
        System.out.println("Despego avion");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion");
    }
}
