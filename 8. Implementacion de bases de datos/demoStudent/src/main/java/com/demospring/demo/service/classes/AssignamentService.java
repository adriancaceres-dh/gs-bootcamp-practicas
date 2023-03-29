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
import java.util.stream.Collectors;

@Service
public class AssignamentService implements ICrudService<AssignmentDTO, Integer> {
    @Autowired
    IAssignmentRepository assignmentRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public AssignmentDTO saveEntity(AssignmentDTO assignmentDTO) {

        var entity = mapper.map(assignmentDTO, Assignment.class);

        entity = assignmentRepository.save(entity);

        return mapper.map(entity, AssignmentDTO.class);
    }

    @Override
    public AssignmentDTO getEntityById(Integer id) {
        var entity = assignmentRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, AssignmentDTO.class);
    }

    @Override
    public List<AssignmentDTO> getAllEntities() {

        var list = assignmentRepository.findAll();

        return list
                .stream()
                .map(
                        assignment -> mapper.map(assignment, AssignmentDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(assignmentRepository.existsById(id)) {
            assignmentRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino el item con ID " + id)
                    .action("Delete")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar una persona con " + id)
                    .action("Delete")
                    .build();
        }
    }
}
