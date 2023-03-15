package com.Sprint1.Sprint1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonasDto {
    private String dni;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String email;


}
