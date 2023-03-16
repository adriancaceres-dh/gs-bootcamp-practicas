package com.glubits.employees.utils;

import com.glubits.employees.entity.Employee;

public class EmployeeFactory {

    public static Employee getTincho(){
        return Employee.builder()
                .name("Tincho")
                .age(30)
                .address("Av. BuenaVista 222")
                .email("martinmarquez@digitalhouse.com")
                .build();
    }

    public static Employee getMarco(){

        return Employee.builder()
                .id(1)
                .name("Marco")
                .age(24)
                .email("marcoavila@digitalhouse.com")
                .address("221B Baker Street")
                .build();
    }

    public static Employee getGabi(){

        return Employee.builder()
                .id(0)
                .name("Gabi")
                .age(19)
                .email("gabimonzon@digitalhouse.com")
                .address("Av. Siempreviva 742")
                .build();
    }

    public static Employee getJean(){
        return Employee.builder()
                .id(2)
                .name("Jean")
                .age(25)
                .email("jeancardo@digitalhouse.com")
                .address("Andén 9 y 3/4")
                .build();
    }
}
