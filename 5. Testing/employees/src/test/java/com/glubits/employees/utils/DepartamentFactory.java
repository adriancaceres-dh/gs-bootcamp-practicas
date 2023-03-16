package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartamentFactory {
    public static Department getTinchoDepartament(){
        return Department.builder()
                .name("Departamento Inventado")
                .employees(
                    List.of(EmployerFactory.getTincho())
                )
                .build();
    }

    public static Department getMarcoDepartament(){
        return Department.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot ")
                .employees(
                        List.of(EmployerFactory.getMarco())
                )
                .build();
    }

    public static Department getGabiDepartament(){
        return Department.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(
                        List.of(EmployerFactory.getGabi())
                )
                .build();
    }

    public static Department getJeanDepartament(){
        return Department.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(
                        List.of(EmployerFactory.getJean())
                )
                .build();
    }
    public static Department getDeleteDepartament(){
        return Department.builder()
                .id(3)
                .name("Departamento para eliminar")
                .employees(List.of())
                .build();
    }
}