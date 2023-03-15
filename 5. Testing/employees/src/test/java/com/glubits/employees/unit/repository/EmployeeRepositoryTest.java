package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.EmployeeFactory;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {

    EmployeeRepository employeeRepository;

    @BeforeEach // antes de cada
    // @BeforeAll // antes de todos
    // @AfterEach // despues de cada
    // @AfterAll // despues de todos
    void setup(){
        employeeRepository = new EmployeeRepository();
    }

    @Test
    void save() {
        // arrange
        Employee entity = EmployeeFactory.getTincho();
        Integer expected = 3;

        // act
        var result = employeeRepository.save(entity);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteWithExistentId() {
        // arrange
        Integer id = 2;
        Integer expected = 2;

        // act
        var result = employeeRepository.delete(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteWithNotExistentId() {
        // arrange
        Integer id = 3;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> employeeRepository.delete(id));
    }

    @Test
    void findById() {
        // arrange
        Integer id = 1;
        Optional<Employee> expected = Optional.of(EmployeeFactory.getMarco());

        // act
        var result = employeeRepository.findById(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByIdNotExistent() {
        // arrange
        Integer id = 3;
        Optional<Employee> expected = Optional.empty();

        // act
        var result = employeeRepository.findById(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        // arrange
        String name = "Gabi";
        Optional<Employee> expected = Optional.ofNullable(EmployeeFactory.getGabi());

        // act
        var result = employeeRepository.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameNotExistent() {
        // arrange
        String name = "Mati";
        List<Employee> expected =  new ArrayList<>();

        // act
        var result = employeeRepository.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAll() {
        // arrange
        List<Employee> expected = List.of(
                EmployeeFactory.getGabi(),
                EmployeeFactory.getMarco(),
                EmployeeFactory.getJean());
        // act
        var result = employeeRepository.listAll();

        // assert
        Assertions.assertEquals(expected, result);
    }
}