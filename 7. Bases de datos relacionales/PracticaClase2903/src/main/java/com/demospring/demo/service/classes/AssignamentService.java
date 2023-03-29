package com.demospring.demo.service.classes;

import com.demospring.demo.dto.AssignmentDTO;
import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.entity.Assignment;
import com.demospring.demo.repository.IAssignmentRepository;
import com.demospring.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignamentService implements ICrudService<AssignmentDTO, Integer> {
    @Autowired
    IAssignmentRepository assignmentRepository;
    ModelMapper mapper = new ModelMapper();
    @Override
    public AssignmentDTO saveEntity(AssignmentDTO assignmentDTO) {
        var entity = mapper.map(assignmentDTO, Assignment.class);
        return mapper.map(//recorre la tabla
                assignmentRepository.save(entity),//pasa la entidad
                AssignmentDTO.class);//transforma el dato recibido a dTO
        //la entidad representa la base de datos y el DTO el postman
    }

    @Override
    public AssignmentDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<AssignmentDTO> getAllEntities() {
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
