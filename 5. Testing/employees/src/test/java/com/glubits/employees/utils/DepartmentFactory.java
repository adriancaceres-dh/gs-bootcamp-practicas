package com.glubits.employees.utils;

import com.glubits.employees.entity.Department;
import org.springframework.context.annotation.Description;


import java.util.List;

public class DepartmentFactory {

    /**
     * Este Department se construyó con la finalidad de crear un nuevo Id, pero como lo crea el método testeado,
     * nosotros en el building NO le colocamos el ID así el método funciona.
     */
    public static Department magicOfTesting() {
        return Department.builder()
                .name("Departamento de la Magia del Testing")
                .employees(
                        List.of(
                                EmployeeFactory.getTincho()
                        )
                )
                .build();
    }
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
    public static Department magicalCreaturesTraining() {
        return Department.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(
                        List.of(
                                EmployeeFactory.getJean()
                        )
                )
                .build();
    }

    public static Department annotationSpellPractices() {
        return Department.builder()
                .id(3)
                .name("Departamento de Prácticas de Hechizos de Anotación")
                .build();
    }

}
