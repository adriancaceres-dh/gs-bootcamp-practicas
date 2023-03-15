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
        // arrange
        DepartmentDTO departmentDTO = DepartmentDTOFactory.getNewDepartament();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationDepartamentWithId0();
        Department entity = DepartmentFactory.getNewDepartament();
        // act
        // whens
        Mockito.when(departmentRepository.save(entity)).thenReturn(0);
        var result = deparmentService.saveDepartment(departmentDTO);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteDeparment() {
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationDepartamentWithId1();
        // act con mocks
        Mockito.when(departmentRepository.delete(1)).thenReturn(1);
        var result = deparmentService.deleteDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAllDeparments() {
        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartamentDefensaArtesAnti(),
                DepartmentDTOFactory.getDepartamentHistorySpringBoot(),
                DepartmentDTOFactory.getCriaturasMagicas(),
                DepartmentDTOFactory.getNewDepartamentNotEmployees());

        List<Department> shouldReturn = List.of(
                DepartmentFactory.getDepartamentDefensaArtesAnti(),
                DepartmentFactory.getDepartamentHistorySpringBoot(),
                DepartmentFactory.getCriaturasMagicas(),
                DepartmentFactory.getNewDepartamentNotEmployees());

        // act
        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = deparmentService.listAllDeparments();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparment() {
        // arrange
        Integer id = 1;
        DepartmentDTO expected = DepartmentDTOFactory.getDepartamentHistorySpringBoot();
        Department historySpringBoot = DepartmentFactory.getDepartamentHistorySpringBoot();
        // act
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(historySpringBoot));
        var result = deparmentService.findOneDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findOneDepartamentWithNotExistentId() {
        // arrange
        Integer id = 999999;

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

        // Arrage
        Integer size = 2;
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getCriaturasMagicas());
        Department criaturasMagicas = DepartmentFactory.getCriaturasMagicas();
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(List.of(criaturasMagicas));
        // act
        var result = deparmentService.findByDepartmentSize(size);
        // asssert
        Assertions.assertEquals(expected,result);

    }

    @Test
    void findByName() {
        // arrange
        String name = "Departamento de defensa numero 5";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getNewDepartamentNotEmployees());
        Department notEmployees = DepartmentFactory.getNewDepartamentNotEmployees();

        // act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of(notEmployees));
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameNotFound() {
        // arrange
        String name = "Amarancio";
        List<DepartmentDTO> expected = List.of();

        // act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of());
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

}
