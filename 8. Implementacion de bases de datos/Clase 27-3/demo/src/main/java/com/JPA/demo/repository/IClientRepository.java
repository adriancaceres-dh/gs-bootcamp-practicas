package com.JPA.demo.repository;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByEmailContaining(String email);

    List<Client> findBycardNumberContaining(String cardNumber);
}
