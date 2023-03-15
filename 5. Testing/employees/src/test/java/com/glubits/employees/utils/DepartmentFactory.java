package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;


import java.util.List;

public class DepartmentFactory {

    public static Department defenseAntiPedagogicalArts() {
        return Department.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(
                        List.of(
                                EmployeeFactory.getGabi()
                        )
                )
                .build();
    }
    public static Department historySpringbootMagic() {
        return Department.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot")
                .employees(
                        List.of(
                                EmployeeFactory.getMarco()
                        )
                )
                .build();
    }
    public static Department MagicalCreaturesTraining() {
        return Department.builder()
                .id(2)
                .name("Departamento de Historia de la Magia de Springboot")
                .employees(
                        List.of(
                                EmployeeFactory.getJean()
                        )
                )
                .build();
    }
}
