package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
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
                clientRepository.save(entity), ClientDTO.class);
    }

    @Override
    public ClientDTO getEntityById(Integer id) {
        var entity = clientRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("No se encontró ningún objeto con ese ID");
                }
        );
        return mapper.map(entity, ClientDTO.class);
    }

    @Override
    public List<ClientDTO> getAllEntities() {
        var listEntity = clientRepository.findAll();
        return listEntity.stream().map(
                client -> mapper.map(client, ClientDTO.class)
        ).collect(Collectors.toList());

    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino el cliente con ID: " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar un cliente con id: " + id)
                    .action("DELETATION")
                    .build();
        }
    }
}
