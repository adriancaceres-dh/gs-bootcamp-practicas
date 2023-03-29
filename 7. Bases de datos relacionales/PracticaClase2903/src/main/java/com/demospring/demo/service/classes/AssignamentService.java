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
        return mapper.map(//recorre la tabla
                assignmentRepository.save(entity),//pasa la entidad
                AssignmentDTO.class);//transforma el dato recibido a dTO
        //la entidad representa la base de datos y el DTO el postman
    }

    @Override
    public AssignmentDTO getEntityById(Integer id) {
        var entity = assignmentRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("No se encuentra la materia con el ID indicado");
                }
        );
        return mapper.map(
                entity,
                AssignmentDTO.class);
    }

    @Override
    public List<AssignmentDTO> getAllEntities() {
        var listEntity = assignmentRepository.findAll();
        return listEntity.stream().map(
                        assignamet -> {
                            var dto = new AssignmentDTO();
                            dto.setId(assignamet.getId());
                            dto.setName(assignamet.getName());
                            dto.setTeacher(assignamet.getTeacher());
                            // aca deben completar el dto con los datos del assigment
                            return dto;
                        }
                        //si tengo muchas linas de codigo en una funcion anonima debo colocar llaves

                ).collect(Collectors.toList());
//        return listEntity.stream().map(
//                        assignment -> mapper.map(assignment, AssignmentDTO.class)
//                )
//                .collect(Collectors.toList());
    }


    @Override
    public MessageDTO deleteEntity(Integer id) {
        if (assignmentRepository.existsById(id)) {
            assignmentRepository.deleteById(id);

            return MessageDTO.builder()
                    .message("Se ha eliminado correctamente la asignatura con id " + id)
                    .action("DELETATION")
                    .build();
        } else {
            return MessageDTO.builder()
                    .message("NO se ha encontrado la asignatura con id " + id)
                    .action("DELETATION")
                    .build();
        }
    }
}

