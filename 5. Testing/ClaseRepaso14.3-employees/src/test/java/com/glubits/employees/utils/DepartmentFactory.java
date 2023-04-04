package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;
import com.glubits.employees.entity.Employee;

public class DepartmentFactory {
    public static Department getDpto1(){
        return Department.builder()
                .id(1)
                .name("Dpto1")


                .build();
    }
}
