package com.bootcamp.calcualadoradecaloriasejpract.service;

import com.bootcamp.calcualadoradecaloriasejpract.repository.Platorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Platoservice {
    @Autowired
    Platorepo platorepo;

    public List<String> getplatos(){
        return platorepo.getPlatos();
    }
}
