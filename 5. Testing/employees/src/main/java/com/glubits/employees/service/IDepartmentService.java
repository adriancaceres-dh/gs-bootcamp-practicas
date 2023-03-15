package com.glubits.employees.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;

import java.util.List;

public interface IDepartmentService {

    CrudDTO saveDepartment(DepartmentDTO deparmentDTO);

    CrudDTO deleteDeparment(Integer integer);

    List<DepartmentDTO> listAllDeparments();

    DepartmentDTO findOneDeparment(Integer id);

    List<DepartmentDTO> findByDepartmentSize(Integer size);

    List<DepartmentDTO> findByName(String name);

}
