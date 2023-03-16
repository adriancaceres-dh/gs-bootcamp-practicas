package com.Sprint1.Sprint1.dto.response;

import com.Sprint1.Sprint1.dto.request.PersonasDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelReservaResponseDto {
    private String fechaDesde;
    private String fechaHasta;
    private String destino;
    private String codigoHotel;
    private Integer cantidadPersonas;
    private String tipoHabitacion;

    private List<PersonasDto> personas;

    private StatusCodeDto estado;
}
