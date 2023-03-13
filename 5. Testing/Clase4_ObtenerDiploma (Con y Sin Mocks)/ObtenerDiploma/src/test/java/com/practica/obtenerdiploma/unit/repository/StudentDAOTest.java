package com.practica.obtenerdiploma.unit.repository;

import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class StudentDAOTest {

    StudentDAO studentDAO = new StudentDAO();

    @Test
    public void findeByIdTest(){
        // arrange
        StudentDTO expected = StudentDTOFactory.getStudent2();
        Long id = 2L;

        // act
        var result = studentDAO.findById(id);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void deleteTest(){
        // arrange
        boolean expected = true;
        Long id = Long.valueOf(1);

        // act
        var result = studentDAO.delete(id);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void deleteTestException(){
        // arrange
        Long id = 23L;

        // act && assert
        Assertions.assertThrows(StudentNotFoundException.class,
                ()->studentDAO.findById(id));
    }

    @Test
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
