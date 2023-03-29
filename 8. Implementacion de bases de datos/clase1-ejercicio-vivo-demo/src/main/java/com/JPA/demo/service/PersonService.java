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
                personRepository.save(entity), PersonDTO.class
        );
    }

    @Override
    public PersonDTO getEntityById(Integer id) {

        var entity = personRepository.findById(id).orElseThrow(
                () -> {throw  new RuntimeException(("No encontre ningun objeto con ese id"));}
        );

        return mapper.map(entity, PersonDTO.class);
    }

    @Override
    public List<PersonDTO> getAllEntities() {
        var list = personRepository.findAll();

        return list.stream().map(
                person ->  mapper.map(person, PersonDTO.class)

        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {

        if(personRepository.existsById(id)){
            personRepository.deleteById(id);

            return MessageDTO.builder()
                    .message("Se elimino la persona con id: " + id)
                    .action("DELETATION")
                    .build();
        }

        return MessageDTO.builder()
                .message("No se encontro la persona con id: " + id)
                .action("DELETATION")
                .build();

    }

    //METODOS NOMBRADOS -> REALIZAN CONSULTAS FUERA DE LAS BASICAS(FINDALL(), FINDBYID(), ETC)
    @Override
    public List<PersonDTO> findByName(String name) {

        var list = personRepository.findByFirstnameContaining(name);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());

    }

    @Override
    public List<PersonDTO> findByAges(Short desde, Short hasta) {

        //Puedo hacer que si los valores no los pasan, tome los min y max dados.
        if (desde == null) {
            desde = Short.MIN_VALUE;
        }
        if (hasta == null) {
            hasta = Short.MAX_VALUE;
        }

        var list = personRepository.findByAgeBetween(desde, hasta);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> findByAgesAndSalary(Short desde, Short hasta, Double salario) {

        var list = personRepository.findByAgeBetweenAndSalaryLessThanEqual(desde,hasta,salario);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> orderByName(String order) {

        List<Person> list;
        Sort sort = null; //Lo utilizo para pasar el ordenamiento

        if(order.equalsIgnoreCase("asc") || order.isEmpty()){
            sort = Sort.by("firstname").ascending();
        }else if(order.equalsIgnoreCase("desc")){
            sort = Sort.by("firstname").descending();
        }

        list = personRepository.findAll(sort);

        return list.stream().map(
                person -> mapper.map(person, PersonDTO.class)
        ).collect(Collectors.toList());
    }
}
