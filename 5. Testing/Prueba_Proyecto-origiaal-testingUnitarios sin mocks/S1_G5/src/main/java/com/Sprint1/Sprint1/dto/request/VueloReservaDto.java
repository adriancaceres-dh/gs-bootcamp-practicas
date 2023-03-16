package com.Sprint1.Sprint1.dto.request;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VueloReservaDto {
    private String fechaDesde;
    private String fechaHasta;
    private String origen;
    private String destino;
    private String codigoVuelo;
    private Integer cantidadAsientos;
    private String claseAsientos;

    private List<PersonasDto> personas;
    private MetodoPagoDto metodoPago;
}
