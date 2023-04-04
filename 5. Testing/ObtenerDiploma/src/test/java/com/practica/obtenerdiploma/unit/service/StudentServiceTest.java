package com.practica.obtenerdiploma.unit.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import com.practica.obtenerdiploma.service.StudentService;
import com.practica.obtenerdiploma.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

@ExtendWith(MockitoExtension.class)

public class StudentServiceTest {

    @Mock
    IStudentDAO studentDAO;

    @Mock
    IStudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;


    @Test
    public void readTest(){
        // arrange
        Long id = 2l;

        StudentDTO expected = RecipeFactory.getStudentSearch();

        // act
        Mockito.when(studentDAO.findById(id)).thenReturn(RecipeFactory.getStudentSearch());

        var result = studentService.read(id);

        // assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void allTest(){
        // arrange


        Set<StudentDTO> expected = RecipeFactory.AllStudent();

        // act
        Mockito.when(studentRepository.findAll()).thenReturn(RecipeFactory.AllStudent());

        var result = studentService.getAll();

        // assert

        Assertions.assertEquals(expected, result);
    }


}
