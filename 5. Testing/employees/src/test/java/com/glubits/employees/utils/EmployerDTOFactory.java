package com.glubits.employees.utils;

import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;

public class EmployerDTOFactory {
    public static EmployeeDTO getTinchoDTO(){
        return EmployeeDTO.builder()
                .name("Tincho")
                .age(30)
                .address("Av. SiempreViva 123")
                .email("martin@digitalhouse.com")
                .build();
    }
    public static EmployeeDTO getMarcoDTO (){
        return EmployeeDTO.builder()
                .id(1)
                .name("Marco")
                .age(24)
                .email("marcoavila@digitalhouse.com")
                .address("221B Baker Street")
                .build();
    }
    public static EmployeeDTO getGabiDTO (){
        return EmployeeDTO.builder()
                .id(0)
                .name("Gabi")
                .age(19)
                .email("gabimonzon@digitalhouse.com")
                .address("Av. Siempreviva 742")
                .build();
    }

    public static EmployeeDTO getJeanDTO (){
        return EmployeeDTO.builder()
                .id(2)
                .name("Jean")
                .age(25)
                .email("jeancardo@digitalhouse.com")
                .address("Andén 9 y 3/4")
                .build();
    }
}
