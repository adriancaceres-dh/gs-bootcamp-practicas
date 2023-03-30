package com.example.demo.service.classes;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.MessageDTO;
import com.example.demo.entity.Doctor;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repository.IDoctorRepository;
import com.example.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService implements ICrudService<DoctorDTO,Integer> {

    @Autowired
    IDoctorRepository doctorRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public DoctorDTO saveEntity(DoctorDTO dto) {
        var entity = mapper.map(dto, Doctor.class);

        doctorRepository.save(entity);

        return mapper.map(entity, DoctorDTO.class);
    }

    @Override
    public List<DoctorDTO> getAllEntities() {
        var list = doctorRepository.findAll();

        return list.stream().map(
                doctor -> mapper.map(doctor, DoctorDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getEntityById(Integer integer) {
        var optional = doctorRepository.findById(integer);

        var entity = optional.orElseThrow(
                () -> {
                    throw new NotFoundException("No se encontro el doctor con el id: " + integer);
                }
        );

        return mapper.map(entity, DoctorDTO.class);
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        var exist = doctorRepository.existsById(integer);

        if(exist){
            doctorRepository.deleteById(integer);
        }else{
            throw new NotFoundException("No se encontro el doctor con id: " + integer);
        }

        return MessageDTO.builder()
                .message("Se elimino el doctor con id: " + integer)
                .action("ELIMINADO")
                .build();
    }
}
