package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

 class DepartmentRepositoryTest {
    DepartmentRepository departmentRepository;
    @BeforeEach
    void setup(){                         //reinicia
        departmentRepository = new DepartmentRepository();
    }
    @Test
    void save() {
        //arrenge
        Department entity = DepartmentFactory.getArtesAntipedagogicas();
        Integer expected = 4;

        //act
        var result = departmentRepository.save(entity);

        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("Verifica que el departamento se puede eliminar cdo no hay empleados en el departamento")
     void delete() {
        //arrange
        Integer id = 3;
        Integer expected = 3;

        //act
        var result = departmentRepository.delete(id);

        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("Verifica que se lanza una excepcion cdo el id no existe")
     void deleteWhitNotExistentId() {
        //arrange
        Integer id = 99999;

        //act & assert
        Assertions.assertThrows(NotFoundException.class,
                ()-> departmentRepository.delete(id));
    }
    @Test
    @DisplayName("Cdo el id existe pero que el departamento tenga empleados asignados")
    void deleteDepartmentWhitEmployees() {
        //arrange
        Integer id = 0;
        Integer expected = 3;

        //act & assert
        Assertions.assertThrows(CouldNotDeleteException.class,
                ()-> departmentRepository.delete(id));
    }

    @Test
    void findById() {
        //arrange
        Integer id = 0;
        Optional<Department> expected = Optional.of(DepartmentFactory.getArtesAntipedagogicas());

        //act
        var result = departmentRepository.findById(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        //arrange
        String name = DepartmentFactory.getArtesAntipedagogicas().getName();
        List<Department> expected = List.of(DepartmentFactory.getArtesAntipedagogicas()) ;

        //act
        var result = departmentRepository.findByName(name);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findBySize() {
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.getArtesAntipedagogicas(),
                DepartmentFactory.getMagiadeSpringboot(),
                DepartmentFactory.getCriaturasMagicas()
        );
        Integer size = 1;
        //act
        var result = departmentRepository.findBySize(size);

        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAll() {
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.getArtesAntipedagogicas(),
                DepartmentFactory.getMagiadeSpringboot(),
                DepartmentFactory.getCriaturasMagicas(),
                DepartmentFactory.getJava()
        );

        //act
        var result = departmentRepository.listAll();

        //assert
        Assertions.assertEquals(expected, result);
    }
}