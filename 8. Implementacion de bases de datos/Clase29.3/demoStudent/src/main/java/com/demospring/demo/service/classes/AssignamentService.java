package com.demospring.demo.service.classes;

import com.demospring.demo.dto.AssignmentDTO;
import com.demospring.demo.entity.Assignment;
import com.demospring.demo.dto.MessageDTO;
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
    IAssignmentRepository AssignamentRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public AssignmentDTO saveEntity(AssignmentDTO AssignmentDTO) {
        var entity = AssignamentRepository.save(mapper.map(AssignmentDTO, Assignment.class));



        return mapper.map(entity, AssignmentDTO.class);
    }

    @Override
    public AssignmentDTO getEntityById(Integer id) {
        var entity = AssignamentRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, AssignmentDTO.class);
    }

    @Override
    public List<AssignmentDTO> getAllEntities() {
        var list = AssignamentRepository.findAll();
        return list.stream().map(
                        person -> mapper.map(person, AssignmentDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(AssignamentRepository.existsById(id)) {
            AssignamentRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino la persona con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar una persona con " + id)
                    .action("DELETATION")
                    .build();
        }
    }

}
