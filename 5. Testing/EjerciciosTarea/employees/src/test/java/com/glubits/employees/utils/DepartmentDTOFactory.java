package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO getDepartamentDTO(){
        return DepartmentDTO.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }
    public static DepartmentDTO getDepartamentDTO1(){
        return DepartmentDTO.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboots")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }
    public static DepartmentDTO getDepartamentDTO2(){
        return DepartmentDTO.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacions")
                .employees(List.of(EmployeeFactory.getJean()))
                .build();
    }
    public static Department getDepartamentDTO3(){
        return Department.builder()
                .id(3)
                .name("Departamento de Defensa contra las artes oscuras")
                .employees(List.of())
                .build();
    }
}
