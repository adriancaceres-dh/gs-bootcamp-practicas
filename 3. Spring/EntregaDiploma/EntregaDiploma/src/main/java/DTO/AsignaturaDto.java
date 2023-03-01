package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor     //Son los constructores, getter y setter, debemos añadir en Spring Lombock
@NoArgsConstructor
@Data

public class AsignaturaDto {
    private String nombre;
    private Double nota;

}
