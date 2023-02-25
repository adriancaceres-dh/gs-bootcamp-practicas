package com.bootcamp.ejemplos;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class EjemploMapas {
    public static void main(String[] args) {
        Map<String,String> indiceLibro = new HashMap<>();
        indiceLibro.put("Pag1","Prologo");
        indiceLibro.put("Pag2","Indice");
        indiceLibro.put("Pag3","Capitulo1");
        indiceLibro.put("Pag4","Bibliografía");


        System.out.println("Usamos HasMap - Mapa no ordenado");
        for (Map.Entry<String, String> pagina: indiceLibro.entrySet()) {

            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }

        Map<String,String> indiceLibro2 = new TreeMap<>();
        indiceLibro2.put("Pag1","Prologo");
        indiceLibro2.put("Pag2","Indice");
        indiceLibro2.put("Pag3","Capitulo1");
        indiceLibro2.put("Pag4","Bibliografía");


        System.out.println("Usamos TreeMap - Mapa ordenado");
        for (Map.Entry<String, String> pagina: indiceLibro2.entrySet()) {

            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }




        Map<String, List<String>> indice3 = new TreeMap<>();

        indice3.put("Cap1",List.of("Pag1","Pag2","Pag3"));
        indice3.put("Cap2",List.of("Pag4","Pag5","Pag6"));
        indice3.put("Cap3",List.of("Pag7","Pag8","Pag9"));

        indice3.put("Autores",List.of("Borges",""));

        for (Map.Entry<String,List<String>> capitulo: indice3.entrySet()) {
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }



    }
}
