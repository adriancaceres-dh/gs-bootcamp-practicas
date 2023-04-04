package com.JPA.demo.service;

import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IPersonRepository;
import com.JPA.demo.service.interfaces.IPersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService implements IPersonService {

    @Autowired
    IPersonRepository personRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public PersonDTO saveEntity(PersonDTO personDTO) {
        var entity = mapper.map(personDTO, Person.class);
        return mapper.map(
                personRepository.save(entity),
                PersonDTO.class);
    }


    @Override
    public PersonDTO getEntityById(Integer id) {
        var entity = personRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, PersonDTO.class);
    }

    @Override
    public List<PersonDTO> getAllEntities() {
        var list = personRepository.findAll();
        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {

        if(personRepository.existsById(id)) {
            personRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino la persona con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar una persona con " + id)
                    .action("DELETATION")
                    .build();
        }
    }

    public List<PersonDTO> findByName(String name){

        var list = personRepository.findByFirstnameContaining(name);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> findByAges(Short desde, Short hasta) {

        if(desde == null)
            desde = Short.MIN_VALUE;
        if (hasta == null)
            hasta = Short.MAX_VALUE;

        var list = personRepository.findByAgeBetween(desde, hasta);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> findByAgesAndSalary(Short desde, Short hasta, Double salario) {
        var list = personRepository.findByAgeBetweenAndSalaryLessThanEqual(desde, hasta, salario);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> orderByName(String order) {
        Sort sort = null;
        if(order.equalsIgnoreCase("asc") || order == null)
            sort = Sort.by("firstname").ascending();
        else if(order.equalsIgnoreCase("desc"))
            sort = Sort.by("firstname").descending();
        
        var list = personRepository.findAll(sort);
        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }
}
