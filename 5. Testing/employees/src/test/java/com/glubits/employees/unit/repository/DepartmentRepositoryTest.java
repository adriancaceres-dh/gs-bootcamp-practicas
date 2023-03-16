package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartamentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        // Arrange
        Department entity = DepartamentFactory.getTinchoDepartament();
        Integer expected = 4;

        // Act
        var result = departmentRepository.save(entity);

        // Assert
        Assertions.assertEquals(result, expected);

    }

    @Test
    void delete() {
        // Arrange
        Integer id = 3;
        Integer expected = 3;

        // Act
        var result = departmentRepository.delete(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void deleteNotExistentId() {
        // Arrange
        Integer id = 9999999;

        // Act & Assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> departmentRepository.delete(id));

    }

    @Test
    void deleteDeparmentWithEmployees() {
        // Arrange
        Integer id = 2;

        // Act & Assert
        Assertions.assertThrows(
                CouldNotDeleteException.class,
                () -> departmentRepository.delete(id));

    }

    @Test
    void findById() {
        // Arrange
        Integer id = 1;
        Optional<Department> expected = Optional.of(DepartamentFactory.getMarcoDepartament());

        // Act
        var result = departmentRepository.findById(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findByName() {
        // Arrange
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        Optional<Department> expected = Optional.of(DepartamentFactory.getGabiDepartament());

        // Act
        var result = departmentRepository.findByName(name);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findBySize() {
        // Arrange
        Integer sizeNames = 4;
        List<Department> expected = List.of(/*DepartamentFactory.getGabiDepartament(),
                                            DepartamentFactory.getMarcoDepartament(),
                                            DepartamentFactory.getJeanDepartament(),
                                            DepartamentFactory.getDeleteDepartament()*/);
        // Integer expected = list.size();

        // Act
        var result = departmentRepository.findBySize(sizeNames);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAll() {
        // Arrange
        List<Department> expected = List.of(DepartamentFactory.getGabiDepartament(),
                DepartamentFactory.getMarcoDepartament(),
                DepartamentFactory.getJeanDepartament(),
                DepartamentFactory.getDeleteDepartament());

        // Act
        var result = departmentRepository.listAll();

        // Assert
        Assertions.assertEquals(expected, result);

    }
}