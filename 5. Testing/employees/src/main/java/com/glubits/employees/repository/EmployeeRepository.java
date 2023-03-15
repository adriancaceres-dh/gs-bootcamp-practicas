package com.glubits.employees.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.utils.enums.CrudEnum;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository implements ICrudRepository<Employee>{

    List<Employee> employees;

    public EmployeeRepository() {
        this.employees = this.loadDataBase();
    }
    @Override
    public Integer save(Employee entity) {
        var newId = employees.size();
        entity.setId(newId);
        employees.add(entity);
        return newId;
    }

    @Override
    public Integer delete(Integer id) {
        if(!employees.removeIf(employee -> Objects.equals(employee.getId(), id))){
            throw new NotFoundException("No pudo encontrarse el empleado con id " + id, CrudEnum.DELETATION);
        }
        return id;
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
    }

    @Override
    public List<Employee> findByName(String name) {
        return employees.stream().filter(employee -> employee.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<Employee> listAll() {
        return employees;
    }

    private List<Employee> loadDataBase(){
        List<Employee> employeeList = null;

        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false) //nueva
                .registerModule(new JavaTimeModule()); // nueva

        TypeReference<List<Employee>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:employees.json");
            employeeList = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
}
