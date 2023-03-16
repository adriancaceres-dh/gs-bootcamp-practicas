package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;

import java.util.List;

public class DepartmentFactory {

    public static Department getMagicWorld(){
        return  Department.builder()
                .id(007)
                .name("magicWorld")
                .employees(
                        List.of(EmployeeFactory.getTincho()))
                .build();

    }
}
