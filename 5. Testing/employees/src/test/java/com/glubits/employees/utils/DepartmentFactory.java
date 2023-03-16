package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentFactory {

    public static Department getDptoDefensaArtesAtipedagogicas(){
        return Department.builder()
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .id(0)
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }

    public static Department getDptoDeHistoriaSpring(){
        return Department.builder()
                .name("Departamento de Historia de la Magia de Springboot ")
                .id(1)
                .employees(List.of(EmployeeFactory.getMarco(), EmployeeFactory.getGabi()))
                .build();
    }

    public static Department getDptoDeCuidadoCriaturas(){
        return Department.builder()
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .id(2)
                .employees(List.of())
                .build();
    }

    public static Department getDptoDePruebaDeTest(){
        return Department.builder()
                .name("Departamento de Prueba de Test")
                .id(3)
                .employees(List.of(EmployeeFactory.getGabi(), EmployeeFactory.getJean()))
                .build();
    }


}
