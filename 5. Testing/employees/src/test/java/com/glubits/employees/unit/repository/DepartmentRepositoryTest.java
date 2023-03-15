package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;

    void setup(){ //ver por qué va esto
        departmentRepository = new DepartmentRepository();
    }

    @Test
    void save(){
        //arrange
        Department entity = DepartmentFactory.defenseAntiPedagogicalArts();
        Integer expected = 0;

        //act
        var result = departmentRepository.save(entity);
        //assert
        Assertions.assertEquals(expected,result);
    }

       @Test
    void deleteWhitExistenteId(){
        //arrange
        Integer id = 0;
        Integer expected = 0;

        //act
        var result = departmentRepository.delete(id);

        //assert
        Assertions.assertEquals(expected,result);

    }

    @Test
    void deleteWithNotExistentId(){
        //arrange
        Integer id = 3;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> departmentRepository.delete(id));
        Assertions.assertThrows(CouldNotDeleteException.class,
                () -> departmentRepository.delete(id));

    }

    @Test
    void findByExistentId(){
        //arrange
        Integer id = 1;
        Optional<Department> expected = Optional.of(DepartmentFactory.historySpringbootMagic());

        //act
        var result = departmentRepository.findById(id);

        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void findByNotExistentId(){
        //arrange
        Integer id = 4;
        Optional<Department> expected = Optional.empty();

        //act
        var result = departmentRepository.findById(id);
        //assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    void findByExistedName(){
        //arrange
        String name = "Gabi";
        List<Department> expected = List.of(DepartmentFactory.defenseAntiPedagogicalArts());

        //act
        var result = departmentRepository.findByName(name);
        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void findByNotExistedName(){
        //arrange
        String name = "Barby";
        List<Department> expected = List.of(); //¿cómo pongo el isEmpty sin error?
        //act
        var result = departmentRepository.findByName(name);
        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void findByWhitSize(){
        //arrange
        Integer size = 2;
        List<Department> expected = List.of(DepartmentFactory.defenseAntiPedagogicalArts(), DepartmentFactory.historySpringbootMagic());
        //act
        var result = departmentRepository.findBySize(size);
        //assert
        Assertions.assertEquals(expected,result);

    }
    @Test
    void findByNotSize(){
        Integer size = 1;
        List<Department> expected = List.of();

        //act
        var result = departmentRepository.findBySize(size);

        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void listAll(){
        //arrange
        List<Department> expected = List.of(
                                            DepartmentFactory.defenseAntiPedagogicalArts(),
                                            DepartmentFactory.historySpringbootMagic(),
                                            DepartmentFactory.MagicalCreaturesTraining());
        //act
        var result = departmentRepository.listAll();
        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void loadDataBase(){
        //arrange

        //act

        //assert

    }

}
