package com.practica.obtenerdiploma.unit.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import com.practica.obtenerdiploma.service.IStudentService;
import com.practica.obtenerdiploma.service.StudentService;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    IStudentDAO studentDAO;

    @InjectMocks
    StudentService studentService;

    @Test
    public void readTest(){
        // arrange
        StudentDTO expected = StudentDTOFactory.getStudent1();

        //act
        Mockito.when(studentDAO.findById(expected.getId())).thenReturn(StudentDTOFactory.getStudent1());
        var resultado = studentService.read(expected.getId());

        // Assert
        Assertions.assertEquals(expected,resultado);
    }


}
