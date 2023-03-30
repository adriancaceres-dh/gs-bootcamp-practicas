package com.JPA.demo.repository;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IClientRepository extends JpaRepository<Client,Integer> {

    //Bidireccionalismo buscando género de persona a través de cliente (join->OneToOne en ambos objetos).
    //Podría hacer lo mismo con buscar info de un cliente a través de una persona.
    // Ej. TC VISA de un cliente a través de person.
    List<Client> findClientByPersonGenreEquals(String genre);

    //listar todos los clientes que tengan entre 20 y 30, o dos años pasados por postman
    //@Query("FROM Client c JOIN Person p WHERE p.age >= :year1 AND p.age <= :year2")
    //List<Person> findByAgesHQL(@Param("year1") Integer year1, @Param("year2") Integer year2);

    //listar todos los clientes que al menos tengan 1 factura asociada
    @Query("SELECT new map(c.email as email) FROM Invoice i JOIN Client c GROUP BY c.email")
    List<Map<String,String>> listClientWithInvoices();
}
