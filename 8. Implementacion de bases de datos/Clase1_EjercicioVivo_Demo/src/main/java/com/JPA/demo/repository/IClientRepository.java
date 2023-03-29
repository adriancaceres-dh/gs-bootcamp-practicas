package com.JPA.demo.repository;

import com.JPA.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientRepository extends JpaRepository<Client,Integer> {

    //Bidireccionalismo buscando género de persona a través de cliente (join->OneToOne en ambos objetos).
    //Podría hacer lo mismo con buscar info de un cliente a través de una persona.
    // Ej. TC VISA de un cliente a través de person.
    List<Client> findClientByPersonGenreEquals(String genre);

}
