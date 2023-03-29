package com.demospring.demo.service.classes;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.service.generics.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements ICrudService<StudentDTO, Integer> {
    @Override
    public StudentDTO saveEntity(StudentDTO personDTO) {
        return null;
    }

    @Override
    public StudentDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllEntities() {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
