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
public class HotelReservaDto {
    private String fechaDesde;
    private String fechaHasta;
    private String destino;
    private String codigoHotel;
    private Integer cantidadPersonas;
    private String tipoHabitacion;

    private List<PersonasDto> personas;
    private MetodoPagoDto metodoPago;

}
