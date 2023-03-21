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

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)

 public final class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;


    @Test
    void saveEmployee(){
        //arrange
        EmployeeDTO employeeDTO = EmployeeDTOFactory.getTinchoDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId1();
        Employee entity = EmployeeFactory.getTincho();

        //act

        Mockito.when(employeeRepository.save(entity)).thenReturn(0);
        var result = employeeService.saveEmployee(employeeDTO);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteEmployee(){
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeleteWithd1();

        Mockito.when(employeeRepository.delete(Mockito.any())).thenReturn(1);
        var result = employeeService.deleteEmployee(id);

        Assertions.assertEquals(expected, result);



    }
    @Test
     void listAllEmployeesTest(){
        List<EmployeeDTO> expected = List.of(
                EmployeeDTOFactory.getGabiDTO(),
                EmployeeDTOFactory.getMarcoDTO(),
                EmployeeDTOFactory.getFacuDTO()
                );
        List<Employee> shouldReturn = List.of(EmployeeFactory.getGabi(),
                EmployeeFactory.getMarco(),
                EmployeeFactory.getFacu());
        //act
        Mockito.when((employeeRepository.listAll())).thenReturn(shouldReturn);
        var result = employeeService.listAllEmployees();

        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findOneEmployee(){
        //arrange
        Integer id = 1;
        EmployeeDTO expected = EmployeeDTOFactory.getMarcoDTO() ;
        Employee marco = EmployeeFactory.getMarco();

        //act
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.of(marco));
        var result = employeeService.findOneEmployee(id);


        //arrange
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findOneEmployeeWithNotExistenId(){
        //arrange
        Integer id = 99999;

       //mocks
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.empty());

        //act & assert
       Assertions.assertThrows(
               NotFoundException.class,
               () -> employeeService.findOneEmployee(id));
    }
    @Test
    void findByName(){
        String name = "Facu";
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getFacuDTO());
        Employee facu = EmployeeFactory.getFacu();

        //act
        Mockito.when(employeeRepository.findByName(name)).thenReturn(Optional.of(facu));
        var result = employeeService.findByName(name);

        Assertions.assertEquals(expected, result);
    }


    }

