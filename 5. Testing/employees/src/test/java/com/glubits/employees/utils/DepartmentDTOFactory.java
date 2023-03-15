package com.glubits.employees.utils;

import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;

import java.util.List;

public class DepartmentDTOFactory {
    public static DepartmentDTO magicOfTestingDTO() {
        return DepartmentDTO.builder()
                .name("Departamento de la Magia del Testing")
                .employees(
                        List.of(
                                EmployeeFactory.getTincho()
                        )
                )
                .build();
    }
    public static DepartmentDTO defenseAntiPedagogicalArtsDTO() {
        return DepartmentDTO.builder()
                .id(0)
                .name("Departamento de Defensa contra las Artes Antipedagogicas")
                .employees(
                        List.of(
                                EmployeeFactory.getGabi()
                        )
                )
                .build();
    }
    public static DepartmentDTO historySpringbootMagicDTO() {
        return DepartmentDTO.builder()
                .id(1)
                .name("Departamento de Historia de la Magia de Springboot")
                .employees(
                        List.of(
                                EmployeeFactory.getMarco()
                        )
                )
                .build();
    }
    public static DepartmentDTO magicalCreaturesTrainingDTO() {
        return DepartmentDTO.builder()
                .id(2)
                .name("Departamento de Cuidado de Criaturas Magicas en capacitacion")
                .employees(
                        List.of(
                                EmployeeFactory.getJean()
                        )
                )
                .build();
    }

    public static DepartmentDTO annotationSpellPracticesDTO() {
        return DepartmentDTO.builder()
                .id(3)
                .name("Departamento de Prácticas de Hechizos de Anotación")
                .build();
    }

}
