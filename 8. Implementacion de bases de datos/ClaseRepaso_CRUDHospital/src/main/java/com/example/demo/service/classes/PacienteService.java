package com.example.demo.service.classes;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.PacienteDTO;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Paciente;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService implements ICrudService<PacienteDTO,Integer> {

    @Autowired
    IPacienteRepository pacienteRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public PacienteDTO saveEntity(PacienteDTO dto) {

        var entity = mapper.map(dto, Paciente.class);

        pacienteRepository.save(entity);

        return mapper.map(entity, PacienteDTO.class);
    }

    @Override
    public List<PacienteDTO> getAllEntities() {
        var list = pacienteRepository.findAll();

        return list.stream().map(
                paciente -> mapper.map(paciente, PacienteDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public PacienteDTO getEntityById(Integer integer) {
        var optional = pacienteRepository.findById(integer);

        var entity = optional.orElseThrow(
                () -> {
                    throw new NotFoundException("No se encontró el paciente con el id: " + integer);
                }
        );

        return mapper.map(entity, PacienteDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        var exist = pacienteRepository.existsById(integer);

        if(exist){
            pacienteRepository.deleteById(integer);
        }else{
            throw new NotFoundException("No se encontró el paciente con id: " + integer);
        }

        return MessageDTO.builder()
                .message("Se elimino el paciente con id: " + integer)
                .action("ELIMINADO")
                .build();
    }

}
