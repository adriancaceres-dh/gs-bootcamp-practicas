package com.JPA.demo.repository;

import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//tiene que haber un repositorio por cada una de las entidades
public interface IPersonRepository extends JpaRepository<Person, Integer> {
    //el primer argumento es el nombre de la entidad, el segundo es el tipo de dato del ID
}
