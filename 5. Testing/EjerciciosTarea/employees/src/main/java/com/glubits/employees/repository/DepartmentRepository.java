package com.glubits.employees.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.exception.CouldNotDeleteException;
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
public class DepartmentRepository implements ICrudRepository<Department>{

    List<Department> departments;

    public DepartmentRepository() {
        this.departments = this.loadDataBase();
    }

    @Override
    public Integer save(Department entity) {
        var newId = departments.size();
        entity.setId(newId);
        departments.add(entity);
        return newId;
    }

    // El metodo permite eliminar un departamento si y solo si no tiene empleados a cargo, es decir
    // que la lista tiene un size de 0
    @Override
    public Integer delete(Integer id) {
        var department = findById(id).orElseThrow(
                () -> {throw new NotFoundException("No pudo encontrarse el departamento con id " + id, CrudEnum.DELETATION);}
        );

        if(!department.getEmployees().isEmpty()){
            throw new CouldNotDeleteException("El departamento no puede eliminarse porque tiene empleados asignados");
        }

        departments.removeIf(d -> d.getId().equals(id));
        return id;
    }

    @Override
    public Optional<Department> findById(Integer id) {
        return departments.stream().filter(department -> department.getId().equals(id)).findFirst();
    }

    @Override
    public List<Department> findByName(String name) {
        return departments.stream().filter(department -> department.getName().contains(name)).collect(Collectors.toList());
    }

    public List<Department> findBySize(Integer size) {
        return departments.stream().filter(department -> department.getEmployees().size() >= size).collect(Collectors.toList());
    }

    @Override
    public List<Department> listAll() {
        return departments;
    }

    private List<Department> loadDataBase(){
        List<Department> departmentList = null;

        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false) //nueva
                .registerModule(new JavaTimeModule()); // nueva

        TypeReference<List<Department>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:department.json");
            departmentList = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return departmentList;
    }
}
