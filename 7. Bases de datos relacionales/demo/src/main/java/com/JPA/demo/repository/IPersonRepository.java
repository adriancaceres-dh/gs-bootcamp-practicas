package com.JPA.demo.repository;

import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

    // Necesitamos un método que busque a través del nombre en la tabla persona
    // MÉTODOS NOMBRADOS
    // EL RETORNO - UN NOMBRE EMPEZADO POR FINDBY Y CON PALABRAS ESPECIFICAS - LOS PARÁMETROS

    List<Person> findByFirstnameContaining(String name);

    // Se necesita un método que busque entre dos números que representan la edad.

    List<Person> findByAgeBetween(Short desde, Short hasta);

    // Se necesita buscar una persona que esté entre dos edades dadas y que tenga un salario menor al dado.

    List<Person> findByAgeBetweenAndSalaryLessThanEqual(Short desde, Short hasta, Double salario);


    List<Person> findByOrderByFirstnameAsc();
}
