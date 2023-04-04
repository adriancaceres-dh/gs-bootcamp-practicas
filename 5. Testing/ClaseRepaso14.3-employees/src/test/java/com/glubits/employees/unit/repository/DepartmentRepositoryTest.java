package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import com.glubits.employees.utils.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository = new DepartmentRepository();

    @Test
    void save() {
        // arrange
        Department entity = DepartmentFactory.getDpto1();
        Integer expected = 3;

        // act
        var result = departmentRepository.save(entity);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void findBySize() {
    }

    @Test
    void listAll() {
    }
}