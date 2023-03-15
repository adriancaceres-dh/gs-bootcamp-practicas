package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;

import java.util.List;
//
public class DepartmentFactory {

    public static Department getDepartament(){
        return Department.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }
    public static Department getDepartament1(){
        return Department.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot ")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }
    public static Department getDepartament2(){
        return Department.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacions")
                .employees(List.of(EmployeeFactory.getJean()))
                .build();
    }
    public static Department getDepartament3(){
        return Department.builder()
                .id(3)
                .name("Departamento de Defensa contra las artes oscuras")
                .employees(List.of())
                .build();
    }
    public static Department getDepartament4(){
        return Department.builder()
                .id(4)
                .name("Departamento de Valentina")
                .employees(List.of())
                .build();
    }

}