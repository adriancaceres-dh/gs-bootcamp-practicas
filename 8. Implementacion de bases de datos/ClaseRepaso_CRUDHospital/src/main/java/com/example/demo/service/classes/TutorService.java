package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.TutorDTO;
import com.example.demo.service.generics.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService implements ICrudService<TutorDTO, Integer> {
    @Override
    public TutorDTO saveEntity(TutorDTO dto) {
        return null;
    }

    @Override
    public List<TutorDTO> getAllEntities() {
        return null;
    }

    @Override
    public TutorDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
