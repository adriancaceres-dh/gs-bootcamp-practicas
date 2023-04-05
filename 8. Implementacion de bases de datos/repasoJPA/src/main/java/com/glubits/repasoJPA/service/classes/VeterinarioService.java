package com.glubits.repasoJPA.service.classes;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.dto.VeterinarioDTO;
import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Veterinario;
import com.glubits.repasoJPA.exceptions.NotFoundException;
import com.glubits.repasoJPA.repository.IDuenioRepository;
import com.glubits.repasoJPA.repository.IVeterinarioRepository;
import com.glubits.repasoJPA.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeterinarioService implements ICrudService<VeterinarioDTO, Integer> {
    @Autowired
    IVeterinarioRepository veterinarioRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public VeterinarioDTO saveEntity(VeterinarioDTO objectDTO) {
        // mappear de dto a entity para llevar al repo
        var entity = mapper.map(objectDTO, Veterinario.class);

        // guardar
        veterinarioRepository.save(entity);

        // mappear de entity a dto para llevar al controller

        return mapper.map(entity, VeterinarioDTO.class);
    }

    @Override
    public List<VeterinarioDTO> getAllEntities() {
        // buscar todos los resultados en el repo
        var list = veterinarioRepository.findAll();
        // luego convertir de entidad a DTO
        return list.stream().map(
                        veterinario -> mapper.map(veterinario, VeterinarioDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public VeterinarioDTO getEntityById(Integer id) {
        // llamo al repo y le paso el id - me devuelve optional
        var opt = veterinarioRepository.findById(id);

        // si optional esta vacio devuelvo excepcion. Si no, la entidad.
        var entity = opt.orElseThrow(
                () -> {
                    throw new NotFoundException("No encontre ningun veterinario con el id: " + id);
                }
        );
        // mapeo de entidad a dto.
        return mapper.map(entity, VeterinarioDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        // buscar el dato en la base de datos y asegurarnos que exista
        var exists = veterinarioRepository.existsById(id);
        // eliminar efectivamente
        if(exists)
            veterinarioRepository.deleteById(id);
        else
            throw new NotFoundException("No pude encontrar el veterinario con id " + id);
        // devolver el mensaje DTO
        return MessageDTO.builder()
                .message("Se elimino el veterinario con id" + id)
                .action("ELIMINACION")
                .build();
    }

    public List<VeterinarioDTO> findByEspecialidad(String especialidad){

        var list = veterinarioRepository.findVeterinarioByEspecialidadContains(especialidad);

        return list.stream().map(
                veterinario -> mapper.map(veterinario, VeterinarioDTO.class)
        )
                .collect(Collectors.toList());
    }
}
