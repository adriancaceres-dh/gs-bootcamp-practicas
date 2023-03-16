package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;

    @BeforeEach
    void setup(){
        departmentRepository = new DepartmentRepository();
    }

    @Test
    void save() {
        // arrange
        Department entity = DepartmentFactory.getDptoDePruebaDeTest();
        Integer expected = 3;

        // act
        var result = departmentRepository.save(entity);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Verificar que un departamento que existe y no tiene empleados puede eliminarse")
    void delete() {
        // Arrange
        Integer id = 2;
        Integer expected = 2;
        // Act
        var result = departmentRepository.delete(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Verificar que se lanza una excepcion cuando el id no existe")
    void deleteNotExistentId() {
        // Arrange
        Integer id = 999999;

        // Act & Assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> departmentRepository.delete(id)
        );

    }

    @Test
    @DisplayName("Verificar que se lanza una excepcion cuando el id exista, pero el departamento tenga empleados asignados")
    void deleteDepartmentWithEmployees() {
        // Arrange
        Integer id = 0;

        // Act & Assert
        Assertions.assertThrows(
                CouldNotDeleteException.class,
                () -> departmentRepository.delete(id)
        );

    }

    @Test
    void findById() {
        // arrange
        Integer id = 0;
        Optional<Department> expected = Optional.of(DepartmentFactory.getDptoDefensaArtesAtipedagogicas());

        // act
        var result = departmentRepository.findById(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        // arrenge
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        List<Department> expected = List.of(DepartmentFactory.getDptoDefensaArtesAtipedagogicas());

        // act
        var result = departmentRepository.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findBySize() {
        // arrange
        Integer size = 2;
        List<Department> expected = List.of(DepartmentFactory.getDptoDeHistoriaSpring());

        // act
        var result = departmentRepository.findBySize(size);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAll() {
        // arrange
        List<Department> expected = List.of(DepartmentFactory.getDptoDefensaArtesAtipedagogicas(), DepartmentFactory.getDptoDeHistoriaSpring(), DepartmentFactory.getDptoDeCuidadoCriaturas());

        // act
        var result = departmentRepository.listAll();

        // assertion
        Assertions.assertEquals(expected, result);
    }
}