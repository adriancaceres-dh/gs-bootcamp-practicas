package com.glubits.employees.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.enums.CrudEnum;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public CrudDTO saveEmployee(EmployeeDTO employeeDTO) {
        var entity = mapper.map(employeeDTO, Employee.class);
        var id = employeeRepository.save(entity);
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + id)
                .action(CrudEnum.CREATION)
                .build();
    }

    @Override
    public CrudDTO deleteEmployee(Integer integer) {
        var id = employeeRepository.delete(integer);
        return CrudDTO.builder()
                .message("Se elimino el empleado con id " +id)
                .action(CrudEnum.DELETATION)
                .build();
    }

    @Override
    public List<EmployeeDTO> listAllEmployees() {
        var list = employeeRepository.listAll();
        return list.stream().map(
                employee -> mapper.map(employee, EmployeeDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO findOneEmployee(Integer id) {
        var employee = employeeRepository.findById(id)
                .orElseThrow(
                        () -> {
                            throw new NotFoundException("No se pudo encontrar el empleado con id " + id);
                        }
                );

        return mapper.map(employee, EmployeeDTO.class);
    }

    @Override
    public List<EmployeeDTO> findByName(String name) {
        var list = employeeRepository.findByName(name);
        return list.stream()
                .map(
                        employee -> mapper.map(employee, EmployeeDTO.class)
                )
                .collect(Collectors.toList());
    }
}
