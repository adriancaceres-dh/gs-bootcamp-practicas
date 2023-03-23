package com.glubits.employees.unit.repository;

import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;

    @BeforeEach
    void setup(){
        departmentRepository = new DepartmentRepository();
    }

    @Test
    void save() {
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
    }

    @Test
    void findByName() {
    }

    @Test
    void findBySize() {
    }

    @Test
    void listAll() {
    }
}