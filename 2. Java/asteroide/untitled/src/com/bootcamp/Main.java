package com.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Juejoasteroide juejoasteroide = new Juejoasteroide(listaParticipantes());
        juejoasteroide.jugar(new Coordenada(4,4));
        System.out.println("Ganador " + juejoasteroide.ganador());

    }

    private static List<IParticipante> listaParticipantes() {

        List<IParticipante> listaParticipantes = new ArrayList<>();

        Nave nave1 = new Nave("Juan1",3,3,0);
        //System.out.println(nave1.distancia(4,4));
        listaParticipantes.add(nave1);



        Nave nave2 = new Nave("Pedro2",6,6,0);
        //System.out.println(nave2.distancia(4,4));
        listaParticipantes.add(nave2);



        Nave nave3 = new Nave("Pedro2",4,4,0);
        Nave nave4 = new Nave("Pedro2",5,5,0);
        List<Nave> naves = new ArrayList<>();
        naves.add(nave3);
        naves.add(nave4);

        Flota flota = new Flota(naves);
        //System.out.println(flota.distancia(4,4));
        listaParticipantes.add(flota);

        return listaParticipantes;

    }
}