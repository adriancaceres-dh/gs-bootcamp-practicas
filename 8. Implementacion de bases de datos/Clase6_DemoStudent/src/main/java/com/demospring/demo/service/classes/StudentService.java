package com.demospring.demo.service.classes;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.entity.Student;
import org.modelmapper.ModelMapper;
import com.demospring.demo.repository.IStudentRepository;
import com.demospring.demo.service.generics.ICrudService;
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


        return mapper.map(studentRepository.save(entity),StudentDTO.class);
    }

    @Override
    public StudentDTO getEntityById(Integer integer) {
        var student = studentRepository.findById(integer).orElseThrow(
                () -> {throw new RuntimeException(("No se encontro el estudiante con id: " + integer));}
        );

        return mapper.map(student, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAllEntities() {
        var list = studentRepository.findAll();

        return list.stream().map(
                student -> mapper.map(student,StudentDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if(studentRepository.existsById(integer)){
            studentRepository.deleteById(integer);

            return MessageDTO.builder()
                    .message("Se elimino el estudiante con id: " + integer)
                    .action("DELETION")
                    .build();
        }

        return MessageDTO.builder()
                .message("No se encontró el estudiante con id: " + integer)
                .action("DELETION")
                .build();
    }

    public List<StudentDTO> findByName(String name){
        var list = studentRepository.findByNameContaining(name);

        return list.stream().map(
                student -> mapper.map(student, StudentDTO.class)
        ).collect(Collectors.toList());
    }
}
