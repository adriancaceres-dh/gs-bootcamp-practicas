package com.glubits.repasoJPA.service.classes;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MascotaDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Mascota;
import com.glubits.repasoJPA.exceptions.NotFoundException;
import com.glubits.repasoJPA.repository.IDuenioRepository;
import com.glubits.repasoJPA.repository.IMascotaRepository;
import com.glubits.repasoJPA.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MascotaService implements ICrudService<MascotaDTO, Integer> {

    @Autowired
    IMascotaRepository mascotaRepository;

    @Autowired
    IDuenioRepository duenioRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public MascotaDTO saveEntity(MascotaDTO objectDTO) {
        // mappear de dto a entity para llevar al repo
        var entity = mapper.map(objectDTO, Mascota.class);

        // En este caso usamos cascada y por ende debemos ir a buscar la entidad duenio existente a la bbdd
        if(objectDTO.getDuenio().getId() != null)
            entity.setDuenio(
                    duenioRepository.findById(objectDTO.getDuenio().getId()).get()
            );

        // guardar
        mascotaRepository.save(entity);

        // mappear de entity a dto para llevar al controller

        return mapper.map(entity, MascotaDTO.class);
    }

    @Override
    public List<MascotaDTO> getAllEntities() {
        // buscar todos los resultados en el repo
        var list = mascotaRepository.findAll();
        // luego convertir de entidad a DTO
        return list.stream().map(
                        mascota -> mapper.map(mascota, MascotaDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MascotaDTO getEntityById(Integer id) {
        // llamo al repo y le paso el id - me devuelve optional
        var opt = mascotaRepository.findById(id);

        // si optional esta vacio devuelvo excepcion. Si no, la entidad.
        var entity = opt.orElseThrow(
                () -> {
                    throw new NotFoundException("No encontre ningun mascota con el id: " + id);
                }
        );
        // mapeo de entidad a dto.
        return mapper.map(entity, MascotaDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        // buscar el dato en la base de datos y asegurarnos que exista
        var exists = mascotaRepository.existsById(id);
        // eliminar efectivamente
        if(exists)
            mascotaRepository.deleteById(id);
        else
            throw new NotFoundException("No pude encontrar la mascota con id " + id);
        // devolver el mensaje DTO
        return MessageDTO.builder()
                .message("Se elimino la mascota con id" + id)
                .action("ELIMINACION")
                .build();
    }
}
