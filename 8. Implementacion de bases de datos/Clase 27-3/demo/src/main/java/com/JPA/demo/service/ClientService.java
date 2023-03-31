package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;

import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;

import com.JPA.demo.repository.IClientRepository;

import com.JPA.demo.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService implements IClientService {

    @Autowired
    IClientRepository clientRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public ClientDTO saveEntity(ClientDTO clientDTO) {
        // aca convierto de DTO (porque viene del controller)
        // a entity (porque va al repositorio)
        var entity = mapper.map(clientDTO, Client.class);

        // aca guardo en la base de datos un entidad
        // lo mas importante es esto.
        entity = clientRepository.save(entity);

        // aca convierto de entity (porque viene del repositorio)
        // a DTO (porque va hacia el controlador)
        return mapper.map(entity,
                ClientDTO.class);
    }

    @Override
    public ClientDTO getEntityById(Integer integer){
        var entity = clientRepository.findById(integer).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, ClientDTO.class);
    }

    @Override
    public List<ClientDTO> getAllEntities(){
        var list = clientRepository.findAll();
        return list.stream().map(
                        client -> mapper.map(client, ClientDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {

        if(clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino al cliente con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar al cliente con " + id)
                    .action("DELETATION")
                    .build();
        }
    }

    public List<ClientDTO> findByEmail(String email){

        var list = clientRepository.findByEmailContaining(email);

        return list.stream().map(
                client -> mapper.map(client, ClientDTO.class)
        ).collect(Collectors.toList());
    }
    public List<ClientDTO> findBycardNumber(String cardNumber){

        var list = clientRepository.findBycardNumberContaining(cardNumber);

        return list.stream().map(
                client -> mapper.map(client, ClientDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<ClientDTO> orderByName(String order) {
        Sort sort = Sort.by("person.firstname");
        if(order.equalsIgnoreCase("asc") || order == null)
    sort = Sort.by("firstname").ascending();
        else if(order.equalsIgnoreCase("desc"))
    sort = Sort.by("firstname").descending();

    var list = clientRepository.findAll(sort);
        return list.stream().map(
                client -> mapper.map(client, ClientDTO.class)
            ).collect(Collectors.toList());
}
}
