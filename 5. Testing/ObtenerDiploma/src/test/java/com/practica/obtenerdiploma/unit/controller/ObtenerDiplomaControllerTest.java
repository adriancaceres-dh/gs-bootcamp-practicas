package com.practica.obtenerdiploma.unit.controller;

import com.practica.obtenerdiploma.controller.ObtenerDiplomaController;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IObtenerDiplomaService;
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
public class ObtenerDiplomaControllerTest {

    @Mock
    IObtenerDiplomaService obternerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    @Test
    public void analyzeScoreTest(){
        // arrange
        Long id = 2L;

        StudentDTO expected = RecipeFactory.analisisScore();

        // act
        Mockito.when(obternerDiplomaService.analyzeScores(id)).thenReturn(RecipeFactory.analisisScore());



        var result = obtenerDiplomaController.analyzeScores(expected.getId());

        // assert

        Assertions.assertEquals(expected, result);
    }
}
