package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Invoice;
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

    ModelMapper mapper = new ModelMapper();
    @Override
    public ClientDTO saveEntity(ClientDTO personDTO) {
        var entity = mapper.map(personDTO, Client.class);
        return mapper.map(
               clientRepository.save(entity),
                ClientDTO.class);
    }

    @Override
    public ClientDTO getEntityById(Integer integer) {
        var entity = clientRepository.findById(integer).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar un cliente con ese ID");}
        );
        return mapper.map(entity, ClientDTO.class);
    }

    @Override
    public List<ClientDTO> getAllEntities() {
        var list = clientRepository.findAll();
        return list.stream().map(
                        client -> mapper.map(client, ClientDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if(clientRepository.existsById(integer)) {
            clientRepository.deleteById(integer);
            return MessageDTO.builder()
                    .message("Se elimino el cliente con ID " + integer)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar el cliente con " + integer)
                    .action("DELETATION")
                    .build();
        }
    }
}
