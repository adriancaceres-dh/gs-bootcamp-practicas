package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO getNewDepartament(){
        return DepartmentDTO.builder()
                .name("Departamento de defensa numero 4")
                .employees(List.of(EmployeeFactory.getTincho()))
                .build();
    }
    public static DepartmentDTO getNewDepartamentNotEmployees(){
        return DepartmentDTO.builder()
                .id(6)
                .name("Departamento de defensa numero 5")
                .employees(new ArrayList<>())
                .build();
    }
    public static DepartmentDTO getCriaturasMagicas() {
        return DepartmentDTO.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(List.of(EmployeeFactory.getJean(),
                        EmployeeFactory.getGabi()))
                .build();
    }
    public static DepartmentDTO getDepartamentDefensaArtesAnti(){
        return DepartmentDTO.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }
    public static DepartmentDTO getDepartamentHistorySpringBoot() {
        return DepartmentDTO.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot ")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }

}

