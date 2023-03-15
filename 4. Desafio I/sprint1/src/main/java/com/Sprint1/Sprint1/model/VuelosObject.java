package com.Sprint1.Sprint1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class VuelosObject {

    private String nroVuelo;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private Double precioPorPersona;
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;

}
