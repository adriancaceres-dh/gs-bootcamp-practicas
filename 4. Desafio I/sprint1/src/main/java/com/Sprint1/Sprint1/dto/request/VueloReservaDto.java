package com.Sprint1.Sprint1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
