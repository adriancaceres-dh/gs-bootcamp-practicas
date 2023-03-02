package com.bootcamp.calcualadoradecaloriasejpract.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Platorepo {
    private List<String> platos = new ArrayList<>();

    public Platorepo(){
        platos.add("milanesa de soja");
        platos.add("lengua a la vinagreta");

    }

    public List<String> getPlatos() {
        return platos;
    }
}
