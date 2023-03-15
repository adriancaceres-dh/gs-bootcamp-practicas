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
    Department entity = DepartmentFactory.getNewDepartament();
    Integer expected = 4;
    // act
    var result = departmentRepository.save(entity);
    // assert
        Assertions.assertEquals(expected, result);
}
    @Test
    void delete() {
        // arrange
        //Añadi en el json un nuevo departamento el cual no tiene empleados y puede ser eliminado.
        Integer id = 6;
        Integer expected = 6;

        // act
        var result = departmentRepository.delete(id);

        // assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    void notDeleteForEmployee() {
        // arrange
        Integer id = 2;

        // act & assert
        Assertions.assertThrows(CouldNotDeleteException.class,
                () -> departmentRepository.delete(id));
    }
    @Test
    void deleteWithNotExistentId() {
        // arrange
        Integer id = 10;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> departmentRepository.delete(id));
    }


    @Test
    void findById() {
        // arrange
        Integer id = 6;
        Optional<Department> expected = Optional.of(DepartmentFactory.getNewDepartamentNotEmployees());

        // act
        var result = departmentRepository.findById(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        // arrange
        String name = "Departamento de defensa numero 5";
        List<Department> expected = List.of(DepartmentFactory.getNewDepartamentNotEmployees());

        // act
        var result = departmentRepository.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findBySize() {
        // Arrage
        Integer size = 2;
        List<Department> expected = List.of(DepartmentFactory.getCriaturasMagicas());
        // act
        var result = departmentRepository.findBySize(size);
        // asssert
        Assertions.assertEquals(expected,result);
    }

    @Test
    void listAll() {
        // arrange
        List<Department> expected = List.of(
                DepartmentFactory.getDepartamentDefensaArtesAnti(),
                DepartmentFactory.getDepartamentHistorySpringBoot(),
                DepartmentFactory.getCriaturasMagicas(),
                DepartmentFactory.getNewDepartamentNotEmployees());
        // act
        var result = departmentRepository.listAll();

        // assert
        Assertions.assertEquals(expected, result);
    }
}