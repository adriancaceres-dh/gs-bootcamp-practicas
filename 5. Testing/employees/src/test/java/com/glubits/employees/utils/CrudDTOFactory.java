package com.glubits.employees.utils;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.utils.enums.CrudEnum;

public class CrudDTOFactory {
    public static CrudDTO crudDTOCreationWidthId0 () {
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + 0)
                .action(CrudEnum.CREATION)
                .build();
    }
    public static CrudDTO crudDTOCreationWidthId3 () {
        return CrudDTO.builder()
                .message("Se creo el empleado con id: " + 3)
                .action(CrudEnum.CREATION)
                .build();
    }

    public static CrudDTO crudDTODeleteWidthId1 () {
        return CrudDTO.builder()
                .message("Se elimino el empleado con id " + 1)
                .action(CrudEnum.DELETATION)
                .build();
    }

    public static CrudDTO crudDTOReadingWhitId999999 () {
        return CrudDTO.builder()
                .message("No se pudo encontrar el empleado con id " + 999999)
                .action(CrudEnum.DELETATION)
                .build();
    }

    public static CrudDTO crudDTOCreateDepartamentId4 (){
        return CrudDTO.builder()
                .message("Se creo el departamento con id: " + 4)
                .action(CrudEnum.CREATION)
                .build();
    }
}
