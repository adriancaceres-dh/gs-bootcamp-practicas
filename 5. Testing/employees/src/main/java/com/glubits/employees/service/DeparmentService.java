package com.glubits.employees.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.utils.enums.CrudEnum;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeparmentService implements IDepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public CrudDTO saveDepartment(DepartmentDTO deparmentDTO) {
        var entity = mapper.map(deparmentDTO, Department.class);
        var id = departmentRepository.save(entity);
        return CrudDTO.builder()
                .message("Se creo el departamento con id: " + id)
                .action(CrudEnum.CREATION)
                .build();
    }

    @Override
    public CrudDTO deleteDeparment(Integer integer) {
        var id = departmentRepository.delete(integer);
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " +id)
                .action(CrudEnum.DELETATION)
                .build();
    }

    @Override
    public List<DepartmentDTO> listAllDeparments() {
        var list = departmentRepository.listAll();
        return list.stream().map(
                department -> mapper.map(department, DepartmentDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public DepartmentDTO findOneDeparment(Integer id) {
        var department = departmentRepository.findById(id)
                .orElseThrow(
                        () -> {
                            throw new NotFoundException("No se pudo encontrar el departamento con id " + id, CrudEnum.READING);
                        }
                );

        return mapper.map(department, DepartmentDTO.class);
    }

    @Override
    public List<DepartmentDTO> findByDepartmentSize(Integer size) {
        var list = departmentRepository.findBySize(size);
        return list.stream()
                .map(
                        department -> mapper.map(department, DepartmentDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<DepartmentDTO> findByName(String name) {
        var list = departmentRepository.findByName(name);
        return list.stream()
                .map(
                        department -> mapper.map(department, DepartmentDTO.class)
                )
                .collect(Collectors.toList());
    }
}
