package com.glubits.employees.unit.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryTest {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Test
    void save(){
        //arrange
        Employee entity = EmployeeFactory.getTincho();
        Integer expected = 3 ;

        //act
        var result= employeeRepository.save(entity);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteWithNotExistenId() {
        //arrange
        Integer id = 3;

        //act & Assert
        Assertions.assertThrows(NotFoundException.class,
                () -> employeeRepository.delete(id));
    }

    @Test

    void delete() {
        //arrange
        Integer id = 2;
        Integer expected = 2;

        //act

        var result = employeeRepository.delete(id);

        //Assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findById(){
        //arrange
        Integer id = 1;
        Optional<Employee> expected = Optional.of(EmployeeFactory.getMarco());

        //act
        var result= employeeRepository.findById(id);

        //assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByIdNotExistent(){
        //arrange
        Integer id = 3;
        Optional<Employee> expected = Optional.empty(); //empty para verificar que llega vacio

        //act
        var result= employeeRepository.findById(id);

        //assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        //arrange
        String name = "Gabi";
        Optional<Employee> expected = Optional.of(EmployeeFactory.getGabi());

        //act
        var result= employeeRepository.findByName(name);

        //assert
        Assertions.assertEquals(expected, result);

    }
    @Test
    void findByNameNotExistent() {
        //arrange
        String name = "Juan";
        Optional<Employee> expected = Optional.empty();

        //act
        var result= employeeRepository.findByName(name);

        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
     void listAll(){
        List<Employee> expected = List.of(EmployeeFactory.getGabi(),
                EmployeeFactory.getMarco(),
                EmployeeFactory.getFacu());

        var result = employeeRepository.listAll();

        Assertions.assertEquals(expected, result);
    }
}
