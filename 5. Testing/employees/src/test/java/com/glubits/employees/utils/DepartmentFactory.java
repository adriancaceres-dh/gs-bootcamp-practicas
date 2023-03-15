package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;

import java.util.Arrays;

public class DepartmentFactory {

    public static Department getDepartmentNew() {
        Employee gabi = Employee.builder()
                .id(0)
                .name("Gabi")
                .age(19)
                .email("gabimonzon@digitalhouse.com")
                .address("Av. Siempreviva 742")
                .build();

        return Department.builder()
                .id(3)
                .name("Departamento de las artes oscuras")
                .employees(Arrays.asList(gabi))
                .build();
    }

    public static Department getDepartment0() {
        Employee gabi = Employee.builder()
                .id(0)
                .name("Gabi")
                .age(19)
                .email("gabimonzon@digitalhouse.com")
                .address("Av. Siempreviva 742")
                .build();

        return Department.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(Arrays.asList(gabi))
                .build();
    }

    public static Department getDepartment1() {
        Employee employee = Employee.builder()
                .id(1)
                .name("Marco")
                .age(24)
                .email("marcoavila@digitalhouse.com")
                .address("221B Baker Street")
                .build();

        return Department.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot")
                .employees(Arrays.asList(employee))
                .build();
    }

    public static Department getDepartment2() {
        Employee employee = Employee.builder()
                .id(2)
                .name("Jean")
                .age(25)
                .email("jeancardo@digitalhouse.com")
                .address("Andén 9 y 3/4")
                .build();

        return Department.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(Arrays.asList(employee))
                .build();
    }
}