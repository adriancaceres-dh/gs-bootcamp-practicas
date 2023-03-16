package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO getDptoDefensaArtesAtipedagogicasDTO(){
        return DepartmentDTO.builder()
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .id(0)
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }

    public static DepartmentDTO getDptoDeHistoriaSpringDTO(){
        return DepartmentDTO.builder()
                .name("Departamento de Historia de la Magia de Springboot ")
                .id(1)
                .employees(List.of(EmployeeFactory.getMarco(), EmployeeFactory.getGabi()))
                .build();
    }

    public static DepartmentDTO getDptoDeCuidadoCriaturasDTO(){
        return DepartmentDTO.builder()
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .id(2)
                .employees(List.of())
                .build();
    }

    public static DepartmentDTO getDptoDePruebaDeTestDTO(){
        return DepartmentDTO.builder()
                .name("Departamento de Prueba de Test")
                .id(3)
                .employees(List.of(EmployeeFactory.getGabi(), EmployeeFactory.getJean()))
                .build();
    }
}
