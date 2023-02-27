package com.bootcamp.interfaz;

import java.util.ArrayList;
import java.util.List;

public class Curriculums extends Documento implements Imprimible {

    private String nombre;
    private String apellido;

    private List<String> habilidades = new ArrayList<>();

    public Curriculums(){}


    @Override
    public void imprimir() {
        System.out.println("Imprimir curriculums");
    }
}
