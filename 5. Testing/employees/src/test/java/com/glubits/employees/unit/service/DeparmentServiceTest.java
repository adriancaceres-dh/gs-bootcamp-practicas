package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.service.DeparmentService;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.DepartmentDTOFactory;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
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
        DepartmentDTO deparmentDTO = DepartmentDTOFactory.getDepartmentNew();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationDepartmentWithId1();
        Department entity = DepartmentFactory.getDepartmentNew();

        Mockito.when(departmentRepository.save(entity)).thenReturn(0);
        var result = deparmentService.saveDepartment(deparmentDTO);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteDeparment() {
        Integer integer = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationDepartmentWithId1();

        Mockito.when(departmentRepository.delete(integer)).thenReturn(integer);
        var result = deparmentService.deleteDeparment(integer);

        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAllDeparments() {
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartment0(),
                DepartmentDTOFactory.getDepartment1(),
                DepartmentDTOFactory.getDepartment2());

        List<Department> shouldReturn = List.of(DepartmentFactory.getDepartment0(),
                DepartmentFactory.getDepartment1(),
                DepartmentFactory.getDepartment2());

        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = deparmentService.listAllDeparments();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparment() {
        Integer id = 2;
        DepartmentDTO expected = DepartmentDTOFactory.getDepartment2();
        Department shouldReturn = DepartmentFactory.getDepartment2();

        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(shouldReturn));
        var result = deparmentService.findOneDeparment(id);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparmentNotExistent() {
        Integer id = 80;

        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.empty());

        Assertions.assertThrows(
                NotFoundException.class,
                () -> deparmentService.findOneDeparment(id)
        );
    }

    @Test
    void findByDepartmentSize() {
        Integer size = 1;
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartment0(),
                DepartmentDTOFactory.getDepartment1(),
                DepartmentDTOFactory.getDepartment2());

        List<Department> shouldReturn = List.of(DepartmentFactory.getDepartment0(),
                DepartmentFactory.getDepartment1(),
                DepartmentFactory.getDepartment2());

        Mockito.when(departmentRepository.findBySize(size)).thenReturn(shouldReturn);
        var result = deparmentService.findByDepartmentSize(size);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartment0());
        List<Department> shouldReturn = List.of(DepartmentFactory.getDepartment0());

        Mockito.when(departmentRepository.findByName(name)).thenReturn(shouldReturn);
        var result = deparmentService.findByName(name);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameNotExistent() {
        String name = "Departamento de Testing";
        List<DepartmentDTO> expected = new ArrayList<>();
        List<Department> shouldReturn = new ArrayList<>();

        Mockito.when(departmentRepository.findByName(name)).thenReturn(shouldReturn);
        var result = deparmentService.findByName(name);

        Assertions.assertEquals(expected, result);
    }
}