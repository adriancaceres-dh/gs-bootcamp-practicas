package com.practica.obtenerdiploma.unit.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ObtenerDiplomaServiceTest {

    @Mock
    IStudentDAO studentDAO;

    @InjectMocks
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    public void analyzeScoresTest(){
        // arrange
        StudentDTO expected = StudentDTOFactory.getStudent1();
        Long id = 1L;

        // act
        Mockito.when(studentDAO.findById(id)).thenReturn(StudentDTOFactory.getStudent1());
        var result = obtenerDiplomaService.analyzeScores(id);

        // assert
        Assertions.assertEquals(expected,result);
    }

}
