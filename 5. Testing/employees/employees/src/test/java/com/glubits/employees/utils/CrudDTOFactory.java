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
    public static CrudDTO crudDTODeletationWithId1() {
        return CrudDTO.builder()
                .message("Se elimino el empleado con id " + 1)
                .action(CrudEnum.DELETATION)
                .build();
    }


    public static CrudDTO crudDTOCreationDepartment(){
       return CrudDTO.builder()
                .message("Se creo el departamento con id: " + 4)
                .action(CrudEnum.CREATION)
                .build();
    }
    public static CrudDTO crudDTODeletationDepartmentId(){
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " + 1)
                .action(CrudEnum.DELETATION)
                .build();
    }
    public static CrudDTO crudDTODeletationDepartmentId3(){
        return CrudDTO.builder()
                .message("Se elimino el departamento con id " + 3)
                .action(CrudEnum.DELETATION)
                .build();
    }
    public static CrudDTO crudDTOReadingNotFindId9999(){
        return CrudDTO.builder()
                .message("No se pudo encontrar el empleado con id " + 9999)
                .action(CrudEnum.DELETATION)
                .build();
    }
}
