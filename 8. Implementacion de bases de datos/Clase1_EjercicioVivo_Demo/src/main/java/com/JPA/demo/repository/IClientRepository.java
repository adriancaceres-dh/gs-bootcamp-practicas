package com.JPA.demo.repository;

import com.JPA.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientRepository extends JpaRepository<Client,Integer> {

    List<Client> findClientByPersonGenre(String genre); //Bidireccionalismo buscando género de persona a través de cliente (join)

}
