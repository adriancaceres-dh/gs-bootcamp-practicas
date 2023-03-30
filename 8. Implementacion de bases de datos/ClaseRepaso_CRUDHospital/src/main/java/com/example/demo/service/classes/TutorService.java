package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.PacienteDTO;
import com.example.demo.dto.TutorDTO;
import com.example.demo.entity.Tutor;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repository.ITutorRepository;
import com.example.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorService implements ICrudService<TutorDTO, Integer> {

    @Autowired
    ITutorRepository tutorRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public TutorDTO saveEntity(TutorDTO dto) {
        var entity = mapper.map(dto, Tutor.class);

        tutorRepository.save(entity);

        return mapper.map(entity, TutorDTO.class);
    }

    @Override
    public List<TutorDTO> getAllEntities() {
        var list = tutorRepository.findAll();

        return list.stream().map(
                tutor -> mapper.map(tutor, TutorDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public TutorDTO getEntityById(Integer integer) {
        var optional = tutorRepository.findById(integer);

        var entity = optional.orElseThrow(
                () -> {
                    throw new NotFoundException("No se encontró el paciente con el id: " + integer);
                }
        );

        return mapper.map(entity, TutorDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        var exist = tutorRepository.existsById(integer);

        if(exist){
            tutorRepository.deleteById(integer);
        }else{
            throw new NotFoundException("No se encontró el paciente con id: " + integer);
        }

        return MessageDTO.builder()
                .message("Se elimino el paciente con id: " + integer)
                .action("ELIMINADO")
                .build();
    }
}
