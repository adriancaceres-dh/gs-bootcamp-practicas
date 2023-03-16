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
        Department entity = DepartmentFactory.getDptoDefensaArtesAtipedagogicas();
        DepartmentDTO departmentDTO = DepartmentDTOFactory.getDptoDefensaArtesAtipedagogicasDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOSaveDepartmentWhitId3();

        // act
        //when
        Mockito.when(departmentRepository.save(entity)).thenReturn(3);
        var result = deparmentService.saveDepartment(departmentDTO);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteDeparment() {
        // arrange
        Integer integer = 2;
        CrudDTO expected = CrudDTOFactory.crudDTODeletionDepartmentWithId2();

        // act - when
        Mockito.when(departmentRepository.delete(integer)).thenReturn(2);
        var result = deparmentService.deleteDeparment(integer);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAllDeparments() {
        // arrange
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDptoDefensaArtesAtipedagogicasDTO(), DepartmentDTOFactory.getDptoDeHistoriaSpringDTO(), DepartmentDTOFactory.getDptoDeCuidadoCriaturasDTO());
        List<Department> shouldReturn = List.of(DepartmentFactory.getDptoDefensaArtesAtipedagogicas(), DepartmentFactory.getDptoDeHistoriaSpring(), DepartmentFactory.getDptoDeCuidadoCriaturas());

        // act - when
        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = deparmentService.listAllDeparments();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparment() {
        // arrange
        Integer id = 1;
        DepartmentDTO expected = DepartmentDTOFactory.getDptoDeHistoriaSpringDTO();
        Optional<Department> shouldReturn = Optional.of(DepartmentFactory.getDptoDeHistoriaSpring());

        // act - when
        Mockito.when(departmentRepository.findById(id)).thenReturn(shouldReturn);
        var result = deparmentService.findOneDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparmentExcpection() {
        // arrange
        Integer id = 999999;
        /*DepartmentDTO expected = DepartmentDTOFactory.getDptoDeHistoriaSpringDTO();
        Optional<Department> shouldReturn = Optional.of(DepartmentFactory.getDptoDeHistoriaSpring());*/

        // mockeos
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.empty());
        //var result = deparmentService.findOneDeparment(id);

        // assert
        Assertions.assertThrows(NotFoundException.class, () -> deparmentService.findOneDeparment(id));
    }
    @Test
    void findByDepartmentSize() {
        // arrange
        Integer size = 2;
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDptoDeHistoriaSpringDTO());
        List<Department> shouldReturn = List.of(DepartmentFactory.getDptoDeHistoriaSpring());

        // act - when
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(shouldReturn);
        var result = deparmentService.findByDepartmentSize(size);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        // arrange
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDptoDefensaArtesAtipedagogicasDTO());
        List<Department> shouldReturn = List.of(DepartmentFactory.getDptoDefensaArtesAtipedagogicas());

        // act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(shouldReturn);
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }
}