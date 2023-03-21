package com.glubits.employees.utils;

import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;

public class EmployeeDTOFactory {

    public static EmployeeDTO getTinchoDTO(){
        return EmployeeDTO.builder()
                .name("Tincho")
                .age(30)
                .address("Av. BuenaVista 222")
                .email("martinmarquez@digitalhouse.com")
                .build();
    }
    public static EmployeeDTO getMarcoDTO(){
        return EmployeeDTO.builder()
                .id(1)
                .name("Marco")
                .age(24)
                .email("marcoavila@digitalhouse.com")
                .address("221B Baker Street")
                .build();
    }
    public static EmployeeDTO getGabiDTO(){
        return EmployeeDTO.builder()
                .id(0)
                .name("Gabi")
                .age(19)
                .email("gabimonzon@digitalhouse.com")
                .address("Av. Siempreviva 742")
                .build();
    }
    public static EmployeeDTO getFacuDTO(){
        return EmployeeDTO.builder()
                .id(2)
                .name("Facu")
                .age(24)
                .email("facuguerra@digitalhouse.com")
                .address("Av. 1 de marzo 3990")
                .build();
    }

}
