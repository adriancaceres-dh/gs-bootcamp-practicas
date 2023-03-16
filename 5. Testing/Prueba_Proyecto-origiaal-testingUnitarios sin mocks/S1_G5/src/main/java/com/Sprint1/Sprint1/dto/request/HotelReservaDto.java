package com.Sprint1.Sprint1.dto.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
