package com.demospring.demo.service.classes;

import com.demospring.demo.dto.AssignmentDTO;
import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.entity.Assignment;
import com.demospring.demo.entity.Student;
import com.demospring.demo.repository.IAssignmentRepository;
import com.demospring.demo.repository.IStudentRepository;
import com.demospring.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements ICrudService<StudentDTO, Integer> {
    @Autowired
    IStudentRepository studentRepository;

    @Autowired
    IAssignmentRepository asssignamentRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    @Transactional
    public StudentDTO saveEntity(StudentDTO studentDTO) {
        var entity = studentRepository.save(mapper.map(studentDTO, Student.class));

        if(studentDTO.getAssignments() != null){
            var list = studentDTO.getAssignments().stream().map(assingnnment ->{
                assingnnment.setStudent(entity);
                return asssignamentRepository.save(assingnnment);
            }).collect(Collectors.toList());
        }

        return mapper.map(entity, StudentDTO.class);
    }

    @Override
    public StudentDTO getEntityById(Integer id) {
        var entity = studentRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAllEntities() {
        var list = studentRepository.findAll();
        return list.stream().map(
                        person -> mapper.map(person, StudentDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
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
