package com.practica.obtenerdiploma.unit.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import com.practica.obtenerdiploma.utils.RecipeFactory;
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
    public void analysisScoreTest(){
        // arrange
        Long id = 2l;

        StudentDTO expected = RecipeFactory.analisisScore();

        // act
        Mockito.when(studentDAO.findById(id)).thenReturn(RecipeFactory.getStudentSearch());

        var result = obtenerDiplomaService.analyzeScores(id);

        // assert

        Assertions.assertEquals(expected, result);
    }
}
