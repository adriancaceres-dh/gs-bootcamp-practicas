package com.JPA.demo.repository;

import com.JPA.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository  extends JpaRepository<Person, Integer> {  //simepre extiende de JpaRepo y se pasa 2 argumentos, la entidad y el tipo de dato del ID.
}
