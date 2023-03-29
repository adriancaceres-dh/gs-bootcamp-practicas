package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IClientRepository;
import com.JPA.demo.repository.IInvoiceRepository;
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

    @Autowired
    IInvoiceRepository invoiceRepository;

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
    public ClientDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<ClientDTO> getAllEntities() {
        // guardo en una variable de tipo List<Client>
        var list = clientRepository.findAll();

        return list
                .stream()
                .map(
                        client -> mapper.map(client, ClientDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
