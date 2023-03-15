package com.practica.obtenerdiploma.unit.repository;


import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;


public class StudentDAORepositoryTest {

    StudentDAO studentDAO = new StudentDAO(); //instanciamos la clase para poder llamar sus metodos

    @Test
    @DisplayName("Probamos que nos triga el alumno segun el id")
    public void findByIdTest (){
        //arrange
        Long id = 2L;
        StudentDTO expected = StudentDTOFactory.getStudent2();


        //act
        var result = studentDAO.findById(id);

        //asserte
        Assertions.assertEquals(expected, result);
    }


    @Test
    @DisplayName("Probamos eliminar un estudiante por su id")
    public void deleteTest(){
        // arrange
        boolean expected = true;
        Long id = 1L;

        // act
        var result = studentDAO.delete(id);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testeamos la excepcion del delete")
    public void deleteTestException(){
        // arrange
        Long id = 23L;

        // act && assert
        Assertions.assertThrows(StudentNotFoundException.class,
                ()->studentDAO.findById(id));
    }

    @Test
    @DisplayName("Testeamos que exista el estudiante segun el id")
    public void existTest(){
        // arrange
        StudentDTO student = StudentDTOFactory.getStudent1();
        boolean expected = true;

        // act
        var result = studentDAO.exists(student);

        // assert
        Assertions.assertEquals(expected,result);
    }
}
