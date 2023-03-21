package com.glubits.employees.utils;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.utils.enums.CrudEnum;

public class CrudDTODeparment {
    public static CrudDTO crudDTOCreationWithId() {
        return CrudDTO.builder()
                .message("Se creo el departamento con id: " + 1)
                .action(CrudEnum.CREATION)
                .build();
    }
}
