package com.JPA.demo.service.interfaces;

import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.service.interfaces.generics.ICrudService;

import java.util.List;

public interface IPersonService extends ICrudService<PersonDTO, Integer> {

    List<PersonDTO> findByName(String name);

    List<PersonDTO> findByAges(Short desde, Short hasta);

    List<PersonDTO> findByAgesAndSalary(Short desde, Short hasta, Double salario);

    List<PersonDTO> orderByName(String order);
}
