package com.demospring.demo.service.classes;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.entity.Student;
import com.demospring.demo.repository.IAssignmentRepository;
import com.demospring.demo.repository.IStudentRepository;
import com.demospring.demo.service.interfaces.IStudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository studentRepository;

    @Autowired
    IAssignmentRepository assignmentRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public StudentDTO saveEntity(StudentDTO studentDTO) {
        var entity = mapper.map(studentDTO, Student.class);

        var list = entity.getAssignments().stream().map(assignment -> assignmentRepository.findById(assignment.getId()).get()).collect(Collectors.toList());

        entity.setAssignments(list);

        entity = studentRepository.save(entity);

        return mapper.map(entity, StudentDTO.class);
    }

    @Override
    public StudentDTO getEntityById(Integer id) {
        var entity = studentRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("No pude encontrar ningun objeto con ese ID");
                }
        );
        return mapper.map(entity, StudentDTO.class);
    }


    @Override
    public List<StudentDTO> getAllEntities() {
        var list = studentRepository.findAll();
        return list.stream().map(
                        student -> mapper.map(student, StudentDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino el estudiante con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar al estudiante con " + id)
                    .action("DELETATION")
                    .build();
        }
    }

    public List<StudentDTO> findByName(String name){

        var list = studentRepository.findBynameContaining(name);

        return list.stream().map(
                student -> mapper.map(student, StudentDTO.class)
        ).collect(Collectors.toList());
    }


}
