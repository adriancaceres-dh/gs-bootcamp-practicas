package com.glubits.employees.utils;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.utils.enums.CrudEnum;

public class CrudDTOFactory {

    public static CrudDTO crudDTOCreationWithId0(){
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + 0)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTOCreationWithId3(){
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

    public static CrudDTO crudDTOReadingNotFoundWithId999999(){
        return CrudDTO.builder()
                .message("No se pudo encontrar el empleado con id " + 999999)
                .action(CrudEnum.READING)
                .build();
    }

    public static CrudDTO crudDTOSaveDepartmentWhitId3(){
        return CrudDTO.builder()
                .message("Se creo el departamento con id: " + 3)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTODeletionDepartmentWithId2(){
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " +2)
                .action(CrudEnum.DELETATION)
                .build();
    }

    public static CrudDTO crudDTOSearchDepartmentNonExistentId(){
        return CrudDTO.builder()
                .message("No se pudo encontrar el departamento con id " + 999999)
                .action(CrudEnum.READING)
                .build();
    }

    public static CrudDTO crudDTODeletionDepartmentWithId0(){
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " +0)
                .action(CrudEnum.DELETATION)
                .build();
    }
}
