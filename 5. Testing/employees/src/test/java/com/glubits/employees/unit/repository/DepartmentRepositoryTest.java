package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;
    @BeforeEach
    void setup(){
        departmentRepository = new DepartmentRepository();
    }

    @Test
    void save() {
        Department entity = DepartmentFactory.getDepartmentNew();
        Integer expected = 3;

        var result = departmentRepository.save(entity);

        Assertions.assertEquals(expected, result);
    }


    @Test
    void findByIdExistent() {
        Integer id = 0;
        Optional<Department> expected = Optional.of(DepartmentFactory.getDepartment0());

        var result = departmentRepository.findById(id);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByIdNotExistent() {
        Integer id = 50;
        Optional<Department> expected = Optional.empty();

        var result = departmentRepository.findById(id);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        String name = "Departamento de Historia de la Magia de Springboot";
        List<Department> expected = List.of(DepartmentFactory.getDepartment1());

        var result = departmentRepository.findByName(name);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameNotExistent() {
        String name = "Departamento de Testing";
        List<Department> expected = new ArrayList<>();

        var result = departmentRepository.findByName(name);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findBySize() {
        Integer size = 1;
        List<Department> expected = List.of(DepartmentFactory.getDepartment0(),
                DepartmentFactory.getDepartment1(),
                DepartmentFactory.getDepartment2());

        var result = departmentRepository.findBySize(size);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void listAll() {
        List<Department> expected = List.of(
                DepartmentFactory.getDepartment0(),
                DepartmentFactory.getDepartment1(),
                DepartmentFactory.getDepartment2());

        var result = departmentRepository.listAll();

        Assertions.assertEquals(expected, result);
    }
}