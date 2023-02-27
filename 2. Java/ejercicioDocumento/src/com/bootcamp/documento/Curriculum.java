package com.bootcamp.documento;

import java.util.ArrayList;
import java.util.List;

public class Curriculum implements Imprimible{
    private String nombre;
    private String apellido;
    private List<String> hablidades = new ArrayList<>();


    @Override
    public void imprimir() {
        System.out.println("imprimir nombre");
    }
}
