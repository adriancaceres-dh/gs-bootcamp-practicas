package com.glubits.employees.utils;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.utils.enums.CrudEnum;

public class CrudDTOFactory {

    public static CrudDTO crudDTOCreationWithId1(){
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + 0)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTOCreationWithId(){
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + 3)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTODeletationWithId1(){
        return CrudDTO.builder()
                .message("Se elimino el empleado con id " +1)
                .action(CrudEnum.DELETATION)
                .build();
    }

    public static CrudDTO crudDTOCreationWithId5(){
        return CrudDTO.builder()
                .message("Se creo el departamento con id: " + 5)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTODeletationWithId5(){
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " + 5)
                .action(CrudEnum.DELETATION)
                .build();
    }
}
