package com.JPA.demo.repository;

import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByFirstnameContaining(String name);

    List<Person> findByAgeBetween(Short desde, Short hasta);

    List<Person> findByAgeBetweenAndSalaryLessThanEqual(Short desde, Short hasta, Double salario);
}
