package com.practica.obtenerdiploma.unit.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import com.practica.obtenerdiploma.service.StudentService;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // iniciamos mockito
public class ObtenerDiplomaServiceTest {
    @Mock //mockeamos las dependencias que tiene el servicio a testear
    IStudentDAO studentDAO;

    @InjectMocks //inyectamos las dependencias mockeadas en el servicio a testear
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    @DisplayName("Testeamos que se genere el promedio y mensaje de cada alumno")
    public void analyzeScoresTest(){
        //arrange
        StudentDTO expected = StudentDTOFactory.getStudent1(); //lo que debe retornar el metodo (en este caso el estudiante 1, que coincide con el id)
        Long id = 1L;//el parametro que necesitamos

        //act
        Mockito.when(studentDAO.findById(id)).thenReturn(StudentDTOFactory.getStudent1());//llamamos al repo de nuevo ya que al mockearlo lo inutilizamos
        //entonces primero tiene que encoentrar el estudiante a traves de los metodos del repo y despues ejecutar el metodo del servicio
        //con los datos obtenidos
        var result = obtenerDiplomaService.analyzeScores(id); //ejecutamos el metodo real con el parametro creado

        //assets
        Assertions.assertEquals(expected,result);
    }
}
