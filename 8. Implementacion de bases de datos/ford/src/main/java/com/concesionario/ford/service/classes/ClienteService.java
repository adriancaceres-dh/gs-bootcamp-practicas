package com.concesionario.ford.service.classes;

import com.concesionario.ford.dto.AutoDTO;
import com.concesionario.ford.dto.ClienteDTO;
import com.concesionario.ford.dto.MessageDTO;
import com.concesionario.ford.entity.Auto;
import com.concesionario.ford.entity.Cliente;
import com.concesionario.ford.exceptions.NotFoundException;
import com.concesionario.ford.repository.IAutoRepository;
import com.concesionario.ford.repository.IClienteRepository;
import com.concesionario.ford.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteService implements ICrudService<ClienteDTO, Integer> {


    @Autowired
    IClienteRepository clienteRepository;
    ModelMapper mapper = new ModelMapper();

    @Override
    public ClienteDTO saveEntity(ClienteDTO objectDTO) {
            var entity = mapper.map(objectDTO, Cliente.class);
            clienteRepository.save(entity);
            return mapper.map(entity, ClienteDTO.class);
    }

    @Override
    public List<ClienteDTO> getAllEntities() {
        var list = clienteRepository.findAll();
        return list.stream().map(
                        cliente -> mapper.map(cliente, ClienteDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDTO getEntityById(Integer id) {
        var opt = clienteRepository.findById(id);
        var entity = opt.orElseThrow(
                () -> {
                    throw new NotFoundException("No encontre ningun dueño con el id: " + id);});
        return mapper.map(entity, ClienteDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        var exists = clienteRepository.existsById(id);
        if(exists)
            clienteRepository.deleteById(id);
        else
            throw new NotFoundException("No pude encontrar el auti con id " + id);
        return MessageDTO.builder()
                .message("Se elimino el auto con id" + id)
                .action("ELIMINACION")
                .build();
    }
}
