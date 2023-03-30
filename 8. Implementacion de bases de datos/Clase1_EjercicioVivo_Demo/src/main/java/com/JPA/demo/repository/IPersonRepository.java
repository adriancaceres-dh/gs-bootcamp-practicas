package com.JPA.demo.repository;

import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonRepository  extends JpaRepository<Person, Integer> {  //simepre extiende de JpaRepo y se pasa 2 argumentos, la entidad y el tipo de dato del ID.

    //Método que busque una persona a través del nombre (MÉTODOS NOMBRADOS)
    //En métodos nombrados siempre comienzan con findBy y utilizando palabras específicas (Ver PG).
    List<Person> findByFirstnameContaining(String name);

    //Método que busque entre 2 números que representan edades limites.
    List<Person> findByAgeBetween(Short desde, Short hasta);

    //Se necesita buscar una persona entre una determinada edad y con un salario menor a uno dado.
    List<Person> findByAgeBetweenAndSalaryLessThanEqual(Short desde, Short hasta, Double salario);

    //List<Person> findByOrderByFirstnameAsc(String order);


    //-----------> PRACTICA HQL <-----------------
    //listar todos los clientes en orden alfabetico.
    @Query("FROM Person p ORDER BY p.firstname DESC")
    List<Person> orderByNameHQL();

    //listar todos los clientes que tengan entre 20 y 30, o dos años pasados por postman
    @Query("FROM Person p WHERE p.age >= :year1 AND p.age <= :year2")
    List<Person> findByAgesHQL(@Param("year1") Integer year1, @Param("year2") Integer year2);

}
