package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.service.EmployeeService;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployeeDTOFactory;
import com.glubits.employees.utils.EmployeeFactory;
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
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;

    @Test
    void saveEmployee() {
        // arrange
        EmployeeDTO employeeDTO = EmployeeDTOFactory.getTinchoDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId1();
        Employee entity = EmployeeFactory.getTincho();
        // act
        // whens
        Mockito.when(employeeRepository.save(entity)).thenReturn(0);
        var result = employeeService.saveEmployee(employeeDTO);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteEmployee() {
        // arrange
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId1();
        // act con mocks
        Mockito.when(employeeRepository.delete(1)).thenReturn(1);
        var result = employeeService.deleteEmployee(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAllEmployees() {
        // arrange
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getGabiDTO(),
                EmployeeDTOFactory.getMarcoDTO(),
                EmployeeDTOFactory.getJeanDTO());

        List<Employee> shouldReturn = List.of(EmployeeFactory.getGabi(),
                EmployeeFactory.getMarco(),
                EmployeeFactory.getJean());

        // act
        Mockito.when(employeeRepository.listAll()).thenReturn(shouldReturn);
        var result = employeeService.listAllEmployees();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneEmployee() {
        // arrange
        Integer id = 1;
        EmployeeDTO expected = EmployeeDTOFactory.getMarcoDTO();
        Employee marco = EmployeeFactory.getMarco();
        // act
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.of(marco));
        var result = employeeService.findOneEmployee(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findOneEmployeeWithNotExistentId() {
        // arrange
        Integer id = 999999;

        // mockeos

        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.empty());

        // act & assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> employeeService.findOneEmployee(id)
        );
    }

    @Test
    void findByName() {
        // arrange
        String name = "Jean";
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getJeanDTO());
        Employee jean = EmployeeFactory.getJean();

        // act
        Mockito.when(employeeRepository.findByName(name)).thenReturn(List.of(jean));
        var result = employeeService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameNotFound() {
        // arrange
        String name = "Amarancio";
        List<EmployeeDTO> expected = new ArrayList<>();
        List<Employee> shouldReturn = new ArrayList<>();

        // act
        Mockito.when(employeeRepository.findByName(name)).thenReturn(shouldReturn);
        var result = employeeService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);
    }
}