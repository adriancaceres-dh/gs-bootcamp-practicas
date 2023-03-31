package com.example.demo.service.classes;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.studentDTO;
import com.example.demo.dto.teacherDTO;
import com.example.demo.service.generics.ICrudService;

import java.util.List;

public class TeacherService implements ICrudService<teacherDTO, Integer> {
    @Override
    public teacherDTO saveEntity(teacherDTO objectDTO) {
        return null;
    }

    @Override
    public List<teacherDTO> getAllEntities() {
        return null;
    }

    @Override
    public teacherDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
