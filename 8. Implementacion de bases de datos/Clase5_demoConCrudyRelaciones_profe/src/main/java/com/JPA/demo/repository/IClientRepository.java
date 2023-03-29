package com.JPA.demo.repository;

import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientRepository extends JpaRepository<Client, Integer> {

    List<Person> findClientByPersonGenderEquals(String gender);

}
