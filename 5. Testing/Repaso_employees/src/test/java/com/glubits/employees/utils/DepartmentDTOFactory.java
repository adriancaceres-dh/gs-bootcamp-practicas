package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO getDepartament(){
        return DepartmentDTO.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }

    public static DepartmentDTO getDepartament1(){
        return DepartmentDTO.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot ")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }

    public static DepartmentDTO getDepartment2(){
        return DepartmentDTO.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(List.of(EmployeeFactory.getJean()))
                .build();
    }

    public static DepartmentDTO getDepartment3(){
        return DepartmentDTO.builder()
                .id(3)
                .name("Departamento de Cuidado contra Los políticos")
                .employees(List.of())
                .build();
    }

    public static DepartmentDTO getDepartment4(){
        return DepartmentDTO.builder()
                .name("Departamento de Cuidado contra la contaminación ambiental")
                .employees(List.of())
                .build();
    }

    public static DepartmentDTO getDepartment6(){
        return DepartmentDTO.builder()
                .id(6)
                .name("Departamento de Lavado de dinero.")
                .employees(List.of())
                .build();
    }

    public static List<DepartmentDTO> listDepartment(){
        return List.of(getDepartament(),
                getDepartament1(),
                getDepartment2(),
                getDepartment3());
    }
}
