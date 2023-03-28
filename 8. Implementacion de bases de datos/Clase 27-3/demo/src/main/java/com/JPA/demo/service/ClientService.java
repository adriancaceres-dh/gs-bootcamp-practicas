package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;

import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;

import com.JPA.demo.repository.IClientRepository;

import com.JPA.demo.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
        var entity = mapper.map(clientDTO, Client.class);
        return mapper.map(
                clientRepository.save(entity),
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
}
