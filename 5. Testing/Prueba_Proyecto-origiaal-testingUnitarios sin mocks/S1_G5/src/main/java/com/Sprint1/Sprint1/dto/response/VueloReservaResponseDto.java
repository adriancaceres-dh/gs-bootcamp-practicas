package com.Sprint1.Sprint1.dto.response;

import com.Sprint1.Sprint1.dto.request.PersonasDto;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VueloReservaResponseDto {
    private String fechaDesde;
    private String fechaHasta;
    private String origen;
    private String destino;
    private String codigoVuelo;
    private Integer cantidadAsientos;
    private String claseAsiento;

    private List<PersonasDto> personas;

    private StatusCodeDto estado;
}
