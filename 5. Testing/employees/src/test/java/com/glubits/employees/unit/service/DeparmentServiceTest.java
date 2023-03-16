package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.service.DeparmentService;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.DepartamentFactory;
import com.glubits.employees.utils.EmployerDTOFactory;
import com.glubits.employees.utils.EmployerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DeparmentServiceTest {

    @Mock
    DepartmentRepository departmentRepository;

    @InjectMocks
    DeparmentService deparmentService;
    @Test
    void saveDepartment() {

    }

    @Test
    void deleteDeparment() {
    }

    @Test
    void listAllDeparments() {
    }

    @Test
    void findOneDeparment() {
    }

    @Test
    void findByDepartmentSize() {
    }

    @Test
    void findByName() {
    }
}