package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.dto.ErrorDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.service.DeparmentService;
import com.glubits.employees.service.IDepartmentService;
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


@ExtendWith(MockitoExtension.class)
public class DeparmentServiceTest {

    @Mock
    DepartmentRepository departmentRepository;

    @InjectMocks
    DeparmentService departmentService;

    @Test
    public void saveDepartmentTest(){
        //arrange
        DepartmentDTO department = DepartmentDTOFactory.getDepartment2();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId5();
        Department entity = DepartmentFactory.getDepartment2();

        //act
        Mockito.when(departmentRepository.save(entity)).thenReturn(5);
        var result = departmentService.saveDepartment(department);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void deleteDeparmentTest(){
        //arrange
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId5();
        Integer integer = 5;

        //act
        Mockito.when(departmentRepository.delete(integer)).thenReturn(integer);
        var result = departmentService.deleteDeparment(integer);

        //Assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void listAllDeparmentsTest(){
        //arrange
        List<DepartmentDTO> expected = DepartmentDTOFactory.listDepartment();
        List<Department> shouldReturn = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartment2(),
                DepartmentFactory.getDepartment3());

        //act
        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = departmentService.listAllDeparments();

        //assert
        Assertions.assertEquals(expected,result);
    }
    //public DepartmentDTO findOneDeparment(Integer id)

    @Test
    public void findOneDepartmentTest(){
        //arrange
        Integer id = 2;
        DepartmentDTO expected = DepartmentDTOFactory.getDepartment2();
        Department department = DepartmentFactory.getDepartment2();

        //act
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(department));
        var result = departmentService.findOneDeparment(id);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void findOneNotExistentDepartmentTest(){
        //arrange
        Integer id = 5;

        //mockeo
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.empty());

        //act && assert
        Assertions.assertThrows(NotFoundException.class,
                ()-> departmentService.findOneDeparment(id));
    }

    @Test
    public void findByDepartmentSizeTest(){
        //arrange
        Integer size = 1;
        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartament(),
                DepartmentDTOFactory.getDepartament1(),
                DepartmentDTOFactory.getDepartment3());

        List<Department> shouldReturn = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartment3());

        //act
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(shouldReturn);
        var result = departmentService.findByDepartmentSize(size);

        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void findByNameTest(){
        //arrange
        String name = DepartmentFactory.getDepartment2().getName();
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartment2());
        List<Department> department = List.of(DepartmentFactory.getDepartment2());

        //act
        Mockito.when(departmentRepository.findByName(name)).thenReturn(department);
        var result = departmentService.findByName(name);

        //assert
        Assertions.assertEquals(expected,result);

    }


}
