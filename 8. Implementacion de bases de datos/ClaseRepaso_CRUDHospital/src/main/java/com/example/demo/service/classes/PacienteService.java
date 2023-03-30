package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.PacienteDTO;
import com.example.demo.service.generics.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements ICrudService<PacienteDTO,Integer> {
    @Override
    public PacienteDTO saveEntity(PacienteDTO dto) {
        return null;
    }

    @Override
    public List<PacienteDTO> getAllEntities() {
        return null;
    }

    @Override
    public PacienteDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }

}
