package com.practica.obtenerdiploma.unit.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import com.practica.obtenerdiploma.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class StudentRepositoryTest {
    StudentRepository studentRepository = new StudentRepository();



    @Test
    @DisplayName("Test que devuelva la lista de estudiantes")
    public void finByAllTest(){
        // arrange - ordenar y crear los datos necesarios
        Set<StudentDTO> expected = RecipeFactory.AllStudent();



        // act - correr el metodo que corresponde
        var result = studentRepository.findAll();

        // assert - fijarnos si es verdaro o falso el assertion
        Assertions.assertEquals(expected, result);

    }


}
