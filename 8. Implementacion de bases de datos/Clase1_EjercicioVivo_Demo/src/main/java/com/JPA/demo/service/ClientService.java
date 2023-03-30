package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IClientRepository;
import com.JPA.demo.repository.IPersonRepository;
import com.JPA.demo.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ClientService implements IClientService {

    @Autowired
    IClientRepository clientRepository;

    IPersonRepository personRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public ClientDTO saveEntity(ClientDTO clientDTO) {
        var entity = mapper.map(clientDTO, Client.class);

        //Person person = personRepository.save(entity.getPerson()); MIN 1:20

        //entity.setPerson();

        return mapper.map(
                clientRepository.save(entity), ClientDTO.class
        );
    }

    @Override
    public ClientDTO getEntityById(Integer integer) {
        var client = clientRepository.findById(integer).orElseThrow(
                ()-> {throw new RuntimeException(("No se encontro el cliente con id: " + integer));}
        );

        return mapper.map(client, ClientDTO.class);
    }

    @Override
    public List<ClientDTO> getAllEntities() {
        var clients = clientRepository.findAll();

        return clients.stream().map(
                client -> mapper.map(client, ClientDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if(clientRepository.existsById(integer)){
            clientRepository.deleteById(integer);

            return MessageDTO.builder()
                    .message("Se elimino el cliente con id: " + integer)
                    .action("DELETATION")
                    .build();
        }

        return MessageDTO.builder()
                .message("No se encontro el cliente con id: " + integer)
                .action("DELETATION")
                .build();
    }

    public List<Map<String,String>> listClientWithInvoices(){
        var list = clientRepository.listClientWithInvoices();

        return list;
    }

    /*public List<ClientDTO> findByAgesHQL(Integer year1, Integer year2){
        var persons = clientRepository.findByAgesHQL(year1, year2);

        return persons.stream().map(
                person -> mapper.map(person, ClientDTO.class)
        ).collect(Collectors.toList());
    }*/

}
