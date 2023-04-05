package com.concesionario.ford.service.classes;


import com.concesionario.ford.dto.AutoDTO;
import com.concesionario.ford.dto.MessageDTO;
import com.concesionario.ford.entity.Auto;
import com.concesionario.ford.exceptions.NotFoundException;
import com.concesionario.ford.repository.IAutoRepository;
import com.concesionario.ford.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutoService implements ICrudService<AutoDTO, Integer> {

    @Autowired
    IAutoRepository autoRepository;
    ModelMapper mapper = new ModelMapper();

    @Override
    public AutoDTO saveEntity(AutoDTO objectDTO) {
        var entity = mapper.map(objectDTO, Auto.class);
        autoRepository.save(entity);
        return mapper.map(entity, AutoDTO.class);
    }

    @Override
    public List<AutoDTO> getAllEntities() {
        var list = autoRepository.findAll();
        return list.stream().map(
                        auto -> mapper.map(auto, AutoDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public AutoDTO getEntityById(Integer id) {
        var opt = autoRepository.findById(id);
        var entity = opt.orElseThrow(
                () -> {
                    throw new NotFoundException("No encontre ningun dueño con el id: " + id);});
        return mapper.map(entity, AutoDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        var exists = autoRepository.existsById(id);
        if(exists)
            autoRepository.deleteById(id);
        else
            throw new NotFoundException("No pude encontrar el auti con id " + id);
        return MessageDTO.builder()
                .message("Se elimino el auto con id" + id)
                .action("ELIMINACION")
                .build();
    }
}
