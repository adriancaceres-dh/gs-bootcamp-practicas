package com.JPA.demo.service.interfaces;

import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Person;
import com.JPA.demo.service.interfaces.generics.ICrudService;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonService extends ICrudService<PersonDTO, Integer> {

    List<PersonDTO> findByName(String name);

    List<PersonDTO> findByAges(Short desde, Short hasta);

    List<PersonDTO> findByAgesAndSalary(Short desde, Short hasta, Double salario);

    List<PersonDTO> orderByName(String order);

    //PRACTICA SENTENCIAS HQL
    List<PersonDTO> orderByNameHQL();

    List<PersonDTO> findByAgesHQL(@Param("year1") Integer year1, @Param("year2") Integer year2);
}
