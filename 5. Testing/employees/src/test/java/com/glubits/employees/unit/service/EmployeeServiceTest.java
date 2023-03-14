package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.service.EmployeeService;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployerDTOFactory;
import com.glubits.employees.utils.EmployerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

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
        // Arrange
        EmployeeDTO employeeDTO = EmployerDTOFactory.getTinchoDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWidthId0();
        Employee entity = EmployerFactory.getTincho();

        // Act
        Mockito.when(employeeRepository.save(entity)).thenReturn(0);
        var result = employeeService.saveEmployee(employeeDTO);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void deleteEmployee() {
        // Arrange
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeleteWidthId1();

        // Act
        Mockito.when(employeeRepository.delete(id)).thenReturn(1);
        var result = employeeService.deleteEmployee(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void listAllEmployees() {
        // Arrange
        List<EmployeeDTO> expected = List.of(EmployerDTOFactory.getGabiDTO(),
                EmployerDTOFactory.getMarcoDTO(),
                EmployerDTOFactory.getJeanDTO());

        List<Employee> shouldReturn = List.of(EmployerFactory.getGabi(),
                EmployerFactory.getMarco(),
                EmployerFactory.getJean());

        // Act
        Mockito.when(employeeRepository.listAll()).thenReturn(shouldReturn);
        var result = employeeService.listAllEmployees();

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findOneEmployee() {
        // Arrange
        Integer id = 1;
        EmployeeDTO expected = EmployerDTOFactory.getMarcoDTO();
        Employee marco = EmployerFactory.getMarco();

        // Act
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.of(marco));
        var result = employeeService.findOneEmployee(id);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    void findOneEmployeeWithNotExistentId() {
        // Arrange
        Integer id = 9999999;

        // Mockeos
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.empty());

        // Act & Assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> employeeService.findOneEmployee(id)
        );
    }

    @Test
    void findByName() {
        // Arrange
        String name = "Jean";
        List<EmployeeDTO> expected = List.of(EmployerDTOFactory.getJeanDTO());
        Employee jean = EmployerFactory.getJean();

        // Act
        Mockito.when(employeeRepository.findByName(name)).thenReturn(Optional.of(jean));
        var result = employeeService.findByName(name);

        // Assert
        Assertions.assertEquals(expected, result);

    }
}