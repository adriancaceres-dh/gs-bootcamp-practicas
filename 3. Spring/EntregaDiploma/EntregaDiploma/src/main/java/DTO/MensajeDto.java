package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor     //Son los constructores, getter y setter, debemos añadir en Spring Lombock
@NoArgsConstructor
@Data

public class MensajeDto {
    private String mensaje;
    private double promedio;
    private String nombreAlumno;
}