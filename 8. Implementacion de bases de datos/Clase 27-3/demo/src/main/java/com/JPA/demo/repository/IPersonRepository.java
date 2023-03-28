package com.JPA.demo.repository;

import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
    // Necesitamos un metodo que busque a traves del nombre en la tabla persona
    // METODOS NOMBRADOS
    // EL RETORNO - UN NOMBRE EMPEZADO POR FINDBY Y CON PALABRAS ESPECIFICAS - LOS PARAMETROS

    List<Person> findByFirstnameContaining(String name);

    // Se necesita un metodo que busque entre dos numeros que representan la edad.

    List<Person> findByAgeBetween(Short desde, Short hasta);

    // Se necesita buscar una persona que este entre dos edades dadas y que tenga un salario menor al dado.

    List<Person> findByAgeBetweenAndSalaryLessThanEqual(Short desde, Short hasta, Double salario);


    List<Person> findByOrderByFirstnameAsc();
}
