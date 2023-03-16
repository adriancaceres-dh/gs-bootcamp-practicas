package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository= new DepartmentRepository();
    //no lleva autowired porque NO HAY CONTEXTO DE SPRING
    @Test
    void save() {
//        public Integer save(Department entity) {
//            var newId = departments.size();
//            entity.setId(newId);
//            departments.add(entity);
//            return newId;
//        }
        //arrenge
    Department entity = DepartmentFactory.getMagicWorld();
    Integer expected = 2;

        //act
        var result Integer = departmentRepository.save(entity);
        //assert

        Assertions.assertEquals(expected, result);
    }

    @Test
    void delete() {
        //arrenge

        //act

        //assert
    }

    @Test
    void findById() {
        //arrenge

        //act

        //assert
    }

    @Test
    void findByName() {
        //arrenge

        //act

        //assert
    }

    @Test
    void findBySize() {
        //arrenge

        //act

        //assert
    }

    @Test
    void listAll() {
    }
}