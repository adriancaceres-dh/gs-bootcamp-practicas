package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.DepartmentFactory;
import com.glubits.employees.utils.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;

    @BeforeEach // ejecuta el setup, que tenga departRepo desde cero
        // antes de cada
        // @BeforeAll // antes de todos
        // @AfterEach // despues de cada
        // @AfterAll // despues de todos
    void setup(){
        departmentRepository = new DepartmentRepository();
    }
    @Test
    void save () {
        // arrange
        Department entity   = DepartmentFactory.getDepartament4();
        Integer    expected = 4;

        // act
        var result = departmentRepository.save(entity);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void delete () {
        //arrange
        Integer id       = 3;
        Integer expected = 3;

        //act
        var result = departmentRepository.delete(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteWithNotExistentId () {
        // arrange
        Integer id = 7;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> departmentRepository.delete(id));
    }

    @Test
    public void deleteDepartmentWithEmployee () {
        //arrange
        Integer id = 0;

        //act & assert
        Assertions.assertThrows(CouldNotDeleteException.class,
                () -> departmentRepository.delete(id));
    }

    @Test
    void findById () {
        //arrange
        Integer              id       = 1;
        Optional<Department> expected = Optional.of(DepartmentFactory.getDepartament1());

        //act
        var result = departmentRepository.findById(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName () {
        // arrange
        String           name     = DepartmentFactory.getDepartament1()
                .getName();
        List<Department> expected = List.of(DepartmentFactory.getDepartament1());


        //act
        var result = departmentRepository.findByName(name);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findBySize () {
        //arrange
        Integer size = 1;
        List<Department> expected = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartament2());

        //act
        var result = departmentRepository.findBySize(size);

        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAll () {
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartament2(),
                DepartmentFactory.getDepartament3());

        // act
        var result = departmentRepository.listAll();

        // assert
        Assertions.assertEquals(expected, result);
    }
}