package com.practica.obtenerdiploma.unit.repository;


import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class StudentRepositoryTest {

    StudentRepository studentRepository = new StudentRepository();

    /*@Test
    public void findAllTest(){
        // arrange
        Set<StudentDTO> expected = StudentDTOFactory.listStudent();

        // act
        var resul = studentRepository.findAll();

        // assert
        Assertions.assertEquals(expected,resul);

    }*/



}
