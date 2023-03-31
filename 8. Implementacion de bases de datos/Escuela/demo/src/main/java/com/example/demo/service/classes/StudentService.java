package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.projectDTO;
import com.example.demo.dto.studentDTO;
import com.example.demo.service.generics.ICrudService;

import java.util.List;

public class StudentService implements ICrudService<studentDTO, Integer> {
    @Override
    public studentDTO saveEntity(studentDTO objectDTO) {
        return null;
    }

    @Override
    public List<studentDTO> getAllEntities() {
        return null;
    }

    @Override
    public studentDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
