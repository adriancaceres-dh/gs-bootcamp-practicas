package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository = new DepartmentRepository();

    @Test
    public void saveTest(){
        // arrange
        Department department = DepartmentFactory.getDepartament();
        Integer  expected = 4;

        // act
        var result = departmentRepository.save(department);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void deleteTest(){
        //arrange
        Integer id = 3;
        Integer expected = 3;

        //act
        var result = departmentRepository.delete(id);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void deleteDepartmentWithEmployee(){
        //arrange
        Integer id = 0;

        //act & assert
        Assertions.assertThrows(CouldNotDeleteException.class,
                ()->departmentRepository.delete(id));
    }

    @Test
    public void deleteNotExistentDepartment(){
        //arrange
        Integer id = 4;

        //act & assert
        Assertions.assertThrows(NotFoundException.class,
                ()->departmentRepository.delete(id));
    }

    @Test
    public void findByIdTest(){
        //arrange
        Optional<Department> expected = Optional.of(DepartmentFactory.getDepartament1());
        Integer id = 1;

        //act
        var result = departmentRepository.findById(id);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void findByNameTest(){
        //arrange
        String name = DepartmentFactory.getDepartment2().getName();
        List<Department> expected = List.of(DepartmentFactory.getDepartment2());

        //act
        var result = departmentRepository.findByName(name);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void findBySizeTest(){
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartment2()
                );
        Integer size = 1;

        //act
        var result = departmentRepository.findBySize(size);

        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void listAllTest(){
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.getDepartament(),
                DepartmentFactory.getDepartament1(),
                DepartmentFactory.getDepartment2(),
                DepartmentFactory.getDepartment3()
        );

        //act
        var result = departmentRepository.listAll();

        //assert
        Assertions.assertEquals(expected,result);
    }


}
