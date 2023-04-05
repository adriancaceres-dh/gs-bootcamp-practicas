package com.glubits.repasoJPA.service.classes;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.exceptions.NotFoundException;
import com.glubits.repasoJPA.repository.IDuenioRepository;
import com.glubits.repasoJPA.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DuenioService implements ICrudService<DuenioDTO, Integer> {

    @Autowired
    IDuenioRepository duenioRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public DuenioDTO saveEntity(DuenioDTO objectDTO) {
        // mappear de dto a entity para llevar al repo
        var entity = mapper.map(objectDTO, Duenio.class);

        // guardar
        duenioRepository.save(entity);

        // mappear de entity a dto para llevar al controller

        return mapper.map(entity, DuenioDTO.class);
    }

    @Override
    public List<DuenioDTO> getAllEntities() {
        // buscar todos los resultados en el repo
        var list = duenioRepository.findAll();
        // luego convertir de entidad a DTO
        return list.stream().map(
                duenio -> mapper.map(duenio, DuenioDTO.class)
        )
                .collect(Collectors.toList());
    }

    @Override
    public DuenioDTO getEntityById(Integer id) {
        // llamo al repo y le paso el id - me devuelve optional
        var opt = duenioRepository.findById(id);

        // si optional esta vacio devuelvo excepcion. Si no, la entidad.
        var entity = opt.orElseThrow(
                () -> {
                    throw new NotFoundException("No encontre ningun dueño con el id: " + id);
                }
        );
        // mapeo de entidad a dto.
        return mapper.map(entity, DuenioDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        // buscar el dato en la base de datos y asegurarnos que exista
        var exists = duenioRepository.existsById(id);
        // eliminar efectivamente
        if(exists)
            duenioRepository.deleteById(id);
        else
            throw new NotFoundException("No pude encontrar el dueño con id " + id);
        // devolver el mensaje DTO
        return MessageDTO.builder()
                .message("Se elimino el dueño con id" + id)
                .action("ELIMINACION")
                .build();
    }
}
