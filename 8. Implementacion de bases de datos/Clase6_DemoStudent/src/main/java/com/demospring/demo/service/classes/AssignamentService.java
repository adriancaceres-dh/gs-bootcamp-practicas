package com.demospring.demo.service.classes;

import com.demospring.demo.dto.AssignmentDTO;
import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.entity.Assignment;
import com.demospring.demo.entity.Student;
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


        return mapper.map(assignmentRepository.save(entity), AssignmentDTO.class);
    }

    @Override
    public AssignmentDTO getEntityById(Integer integer) {

        var assignment = assignmentRepository.findById(integer).orElseThrow(
                () -> {throw new RuntimeException(("No se encontro la asignatura con id: " + integer));}
        );

        return mapper.map(assignment, AssignmentDTO.class);
    }

    @Override
    public List<AssignmentDTO> getAllEntities() {
        var list = assignmentRepository.findAll();

        return list.stream().map(
                assignment -> mapper.map(assignment,AssignmentDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if(assignmentRepository.existsById(integer)){
            assignmentRepository.deleteById(integer);

            return MessageDTO.builder()
                    .message("Se elimino la asignatura con id: " + integer)
                    .action("DELETION")
                    .build();
        }

        return MessageDTO.builder()
                .message("No se encontró la asignatura con id: " + integer)
                .action("DELETION")
                .build();
    }
}
