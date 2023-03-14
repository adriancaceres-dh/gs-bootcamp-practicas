package com.glubits.employees.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    CrudDTO saveEmployee(EmployeeDTO employeeDTO);

    CrudDTO deleteEmployee(Integer integer);

    List<EmployeeDTO> listAllEmployees();

    EmployeeDTO findOneEmployee(Integer id);

    List<EmployeeDTO> findByName(String name);
}
