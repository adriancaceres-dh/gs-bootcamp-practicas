package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.service.DeparmentService;
import com.glubits.employees.service.EmployeeService;
import com.glubits.employees.utils.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DeparmentServiceTest {

    @Mock
    DepartmentRepository departmentRepository;

    @InjectMocks
    DeparmentService deparmentService;

    @Test
    void saveDepartment() {
            //arrange
            DepartmentDTO department = DepartmentDTOFactory.getDepartamentDTO2();
            CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId2();
            Department entity = DepartmentFactory.getDepartament2();

            //act
            Mockito.when(departmentRepository.save(entity)).thenReturn(2);
            var result = deparmentService.saveDepartment(department);

            //assert
            Assertions.assertEquals(expected,result);
        }

    @Test
    void deleteDeparment() {
        // arrange
        Integer id = 2;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId2();
        // act con mocks
        Mockito.when(departmentRepository.delete(2)).thenReturn(2);
        var result = deparmentService.deleteDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

/*
    @Test
    void deleteWithNotExistentId() {
        // arrange
        Integer id = 3;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> departmentRepository.delete(id));
    }*/

    @Test
    void listAllDeparments() {
        // arrange
        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartamentDTO(),
                DepartmentDTOFactory.getDepartamentDTO1(),
                DepartmentDTOFactory.getDepartamentDTO2());

        List<Department> shouldReturn = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartament2());

        // act
        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = deparmentService.listAllDeparments();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparment() {

        // arrange
        Integer id = 2;
        DepartmentDTO expected = DepartmentDTOFactory.getDepartamentDTO2();
        Department department2 = DepartmentFactory.getDepartament2();
        // act
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(department2));
        var result = deparmentService.findOneDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDepartmentWithNotExistentId() {
        // arrange
        Integer id = 9;

        // mockeos

        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.empty());

        // act & assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> deparmentService.findOneDeparment(id)
        );
    }
    @Test
    void findByDepartmentSize() {
        // Arrange
        Integer size = 1;
        List<Department> departments = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartament2()
        );

        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartamentDTO(),
                DepartmentDTOFactory.getDepartamentDTO1(),
                DepartmentDTOFactory.getDepartamentDTO2()
        );

        // Act
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(departments);
        List<DepartmentDTO> result = deparmentService.findByDepartmentSize(size);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void findByName() {
        // arrange
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartamentDTO());
        Department department = DepartmentFactory.getDepartament();

        // act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of(department));
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }





}