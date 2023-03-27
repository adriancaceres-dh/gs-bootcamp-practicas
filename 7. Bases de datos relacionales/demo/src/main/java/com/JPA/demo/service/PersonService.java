package com.JPA.demo.service;

import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IPersonRepository;
import com.JPA.demo.service.interfaces.IPersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
                PersonDTO.class
        );
    }

    @Override
    public PersonDTO getEntityById(Integer id) {
        var entity = personRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No se pudo encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, PersonDTO.class);
    }

    @Override
    public List<PersonDTO> getAllEntities() {
        var list = personRepository.findAll();
        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {

        if(personRepository.existsById(id)) {
            personRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino la persona con ID " + id)
                    .action("DELETATION")
                    .build();
        } else {
            return MessageDTO.builder()
                    .message("No se pudo encontrar una persona con ID " + id)
                    .action("DELETATION")
                    .build();
        }
    }
}
