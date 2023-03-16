package com.Sprint1.Sprint1.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelRequestDto {
    private String nombreUsuario;
    private HotelReservaDto hotelReserva;
}
