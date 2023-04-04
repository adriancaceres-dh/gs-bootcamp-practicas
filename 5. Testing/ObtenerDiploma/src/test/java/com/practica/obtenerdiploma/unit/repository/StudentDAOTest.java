package com.practica.obtenerdiploma.unit.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOTest {

    StudentDAO studentDAO = new StudentDAO();

    /*
    @Test
    @DisplayName("Test que verifica que se elimina un estudiante")
    public void deleteTest(){
        // arrange - ordenar y crear los datos necesarios
        Long id = 1L;


        // act - correr el metodo que corresponde
        var result = studentDAO.delete(id);

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertTrue(result);



    }



    @Test
    @DisplayName("Test que cuando se le passa un id que no esta en la base de datos tire una exeption")
    public void deleteTestExeption(){
        // arrange - ordenar y crear los datos necesarios

        Long id = 0L;



        // assert - fijarnos si es verdaro o falso el assertion


        Assertions.assertThrows(StudentNotFoundException.class,() -> studentDAO.delete(id));

    }



    @Test
    @DisplayName("Test que verifica si existe un estudiante")
    public void deleteTest(){
        // arrange - ordenar y crear los datos necesarios
        StudentDTO student = RecipeFactory.getStudent();


        // act - correr el metodo que corresponde
        var result = studentDAO.exists(student);

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertTrue(result);



    }

    @Test
    @DisplayName("Test que verifica que salte un exeption cuando no exist el estudiante")
    public void deleteTestExeption(){
        // arrange - ordenar y crear los datos necesarios

        StudentDTO student = RecipeFactory.getNotStudent();



        // assert - fijarnos si es verdaro o falso el assertion


        Assertions.assertThrows(StudentNotFoundException.class,() -> studentDAO.exists(student));

    }

     */

    @Test
    @DisplayName("Test que verifica si existe un estudiante y lo devuelve")
    public void finByTest(){
        // arrange - ordenar y crear los datos necesarios
        Long id = 2L;
        StudentDTO expected = RecipeFactory.getStudentSearch();



        // act - correr el metodo que corresponde
        var result = studentDAO.findById(id);

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertEquals(expected, result);

    }
}
