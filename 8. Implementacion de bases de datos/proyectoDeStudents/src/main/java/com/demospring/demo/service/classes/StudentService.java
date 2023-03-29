package com.demospring.demo.service.classes;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.entity.Student;
import com.demospring.demo.repository.IStudentRepository;
import com.demospring.demo.service.generics.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements ICrudService<StudentDTO, Integer> {
    @Autowired
    IStudentRepository studentRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public StudentDTO saveEntity(StudentDTO studentDTO) {
        var entity = mapper.map(studentDTO, Student.class);
        return mapper.map(
                studentRepository.save(entity),
                StudentDTO.class
        );
    }

    @Override
    public StudentDTO getEntityById(Integer id) {
        var entity = studentRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No se encontró estudiante con ese ID");}
        );
        return mapper.map(entity, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAllEntities() {
        var listStudents = studentRepository.findAll();
        return listStudents.stream().map(
                student -> mapper.map(student, StudentDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se eliminó el alumno con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else {
            return MessageDTO.builder()
                    .message("No se encontro ningun alumno con el ID " + id)
                    .action("DELETATION")
                    .build();
        }
    }
}
