package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentFactory {
    public static Department getNewDepartament(){
        return Department.builder()
                .name("Departamento de defensa numero 4")
                .employees(List.of(EmployeeFactory.getTincho()))
                .build();
    }
    public static Department getNewDepartamentNotEmployees(){
        return Department.builder()
                .id(6)
                .name("Departamento de defensa numero 5")
                .employees(new ArrayList<>())
                .build();
    }
    public static Department getCriaturasMagicas() {
        return Department.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(List.of(EmployeeFactory.getJean(),
                        EmployeeFactory.getGabi()))
                .build();
    }
    public static Department getDepartamentDefensaArtesAnti(){
        return Department.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(List.of(EmployeeFactory.getGabi()))
                .build();
    }
    public static Department getDepartamentHistorySpringBoot() {
        return Department.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot ")
                .employees(List.of(EmployeeFactory.getMarco()))
                .build();
    }

}
