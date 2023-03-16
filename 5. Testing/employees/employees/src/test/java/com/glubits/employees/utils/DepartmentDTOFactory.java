package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO getArtesAntipedagogicasDTO(){
        return DepartmentDTO.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }
    public static DepartmentDTO getMagiadeSpringbootDTO(){
        return DepartmentDTO.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }

    public static DepartmentDTO getCriaturasMagicasDTO(){
        return DepartmentDTO.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(List.of(EmployeeFactory.getJean()))
                .build();
    }
    public static DepartmentDTO getJavaDTO(){
        return DepartmentDTO.builder()
                .id(3)
                .name("Departamento de Java")
                .employees(List.of())
                .build();
    }
}
