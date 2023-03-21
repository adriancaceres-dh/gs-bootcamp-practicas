package com.practica.obtenerdiploma.unit.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import com.practica.obtenerdiploma.utils.StudentDTOFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//testeamos cada unos de los metodos
public class StudentRepositoryTest {

    StudentRepository studentRepository = new StudentRepository(); //instanciamos la clase para poder correrla en act

    @Test //siempre tenemos que anotar el test para poder correrlo
    @DisplayName("Testeamos el metodo que lista todos los alumnos")
    public void findAllTest(){ //los test siempre se hacen con void
        // arrange - ordenar y crear los datos necesarios (parametros y metodos de devolucion -return)
        Set<StudentDTO> expected = StudentDTOFactory.listStudent(); //lo que espero que devuelva el metodo


        //act - corrrer el metodo que corresponde -- el resultado de correr el metodo original
        var resul = studentRepository.findAll();

        //asserte - ver si verdadero o falso el assertion
        Assertions.assertEquals(expected, resul);

    }

}
