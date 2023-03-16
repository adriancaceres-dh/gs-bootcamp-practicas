package com.Sprint1.Sprint1.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VuelosObject {

    private String nroVuelo;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private Double precioPorPersona;
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;

}
