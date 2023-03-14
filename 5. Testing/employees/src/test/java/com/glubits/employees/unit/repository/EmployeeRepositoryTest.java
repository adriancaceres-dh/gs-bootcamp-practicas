package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.EmployerFactory;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {

    // @BeforeEach // antes de cada
    // @BeforeAll // andes de todos
    // @AfterEach // después de cada
    // @AfterAll // después de todos
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Test
    void save() {
        // Arrange
        Employee entity = EmployerFactory.getTincho();
        Integer expected = 3;

        // Act
        var result = employeeRepository.save(entity);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void deleteExistentId() { // Cuando encuentre lo que busca
        // Arrange
        Integer id = 2;
        Integer expected = 2;

        // Act
        var result = employeeRepository.delete(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void deleteWithNotExistentId() { // Cuando no encuentre lo que busca
        // Arrange
        Integer id = 3;

        // Act & Assert
        Assertions.assertThrows(NotFoundException.class,
                () -> employeeRepository.delete(id));
    }

    @Test
    void findById() {
        // Arrange
        Integer id = 1;
        Optional<Employee> expected = Optional.of(EmployerFactory.getMarco());

        // Act
        var result = employeeRepository.findById(id);

        //Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findByName() {
        // Arrange
        String name = "Gabi";
        Optional<Employee> expected = Optional.of(EmployerFactory.getGabi());

        // Act
        var result = employeeRepository.findByName(name);

        //Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAll() {
        // Arrange
        List<Employee> expected = List.of(EmployerFactory.getGabi(),
                EmployerFactory.getMarco(),
                EmployerFactory.getJean());
        // Act
        var result = employeeRepository.listAll();
        //Assert
        Assertions.assertEquals(expected, result);
    }
}