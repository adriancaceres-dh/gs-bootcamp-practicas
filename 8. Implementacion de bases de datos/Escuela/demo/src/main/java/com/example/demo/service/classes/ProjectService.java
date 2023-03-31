package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.projectDTO;
import com.example.demo.service.generics.ICrudService;

import java.util.List;

public class ProjectService implements ICrudService<projectDTO, Integer> {
    @Override
    public projectDTO saveEntity(projectDTO objectDTO) {
        return null;
    }

    @Override
    public List<projectDTO> getAllEntities() {
        return null;
    }

    @Override
    public projectDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
