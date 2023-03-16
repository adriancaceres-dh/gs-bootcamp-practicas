package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;
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

import java.awt.*;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)  //para activar las anotaciones que corresponden a Mocks

class DeparmentServiceTest {
    @Mock
    DepartmentRepository departmentRepository;
    @InjectMocks
    DeparmentService deparmentService;

    @Test
    void saveDepartment() {
        //arrage
        DepartmentDTO deparmentDTO = DepartmentDTOFactory.getJavaDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationDepartment();
        Department entity = DepartmentFactory.getJava();

        //act
        //whens
        Mockito.when(departmentRepository.save(entity)).thenReturn(3);
        var results = deparmentService.saveDepartment(deparmentDTO);

        //assert
        Assertions.assertEquals(expected, results);
    }

    @Test
    void deleteDeparment() {
        //arrage
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationDepartmentId();

        //act con Mocks
        Mockito.when(departmentRepository.delete(id)).thenReturn(1);
        var result = deparmentService.deleteDeparment(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAllDeparments() {
        //arrage
       List<DepartmentDTO> expected= List.of(DepartmentDTOFactory.getArtesAntipedagogicasDTO(),
                DepartmentDTOFactory.getMagiadeSpringbootDTO(),
                DepartmentDTOFactory.getCriaturasMagicasDTO()
        );
        List<Department> shoultReturn = List.of(DepartmentFactory.getArtesAntipedagogicas(),
                DepartmentFactory.getMagiadeSpringboot(),
                DepartmentFactory.getCriaturasMagicas()
        );

        //act
        Mockito.when(departmentRepository.listAll()).thenReturn(shoultReturn);
        var result = deparmentService.listAllDeparments();

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneDeparment() {
        //arrage
        Integer id = 1;
        DepartmentDTO expected = DepartmentDTOFactory.getMagiadeSpringbootDTO();
        Department MagiadeSpringboot = DepartmentFactory.getMagiadeSpringboot();

        //act
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(MagiadeSpringboot));
        var result = deparmentService.findOneDeparment(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByDepartmentSize() {
        //arrage
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getArtesAntipedagogicasDTO(),
                DepartmentDTOFactory.getMagiadeSpringbootDTO(),
                DepartmentDTOFactory.getCriaturasMagicasDTO()
        );
        List<Department> shoultReturn = List.of(DepartmentFactory.getArtesAntipedagogicas(),
                DepartmentFactory.getMagiadeSpringboot(),
                DepartmentFactory.getCriaturasMagicas()
        );
        Integer size = 1;

        //act
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(shoultReturn);
        var result = deparmentService.findByDepartmentSize(size);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        //arrage
        String name = "Departamento de Cuidado de Criaturas Magicas en capacitacion";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getCriaturasMagicasDTO());
        Department CriaturasMagicas = DepartmentFactory.getCriaturasMagicas();

        //act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of(CriaturasMagicas));
        var result = deparmentService.findByName(name);

        //assert
        Assertions.assertEquals(expected, result);
    }
}