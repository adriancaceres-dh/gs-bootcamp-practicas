package com.glubits.employees.dto;

import com.glubits.employees.utils.enums.CrudEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrudDTO {

    private String message;

    private CrudEnum action;

}
