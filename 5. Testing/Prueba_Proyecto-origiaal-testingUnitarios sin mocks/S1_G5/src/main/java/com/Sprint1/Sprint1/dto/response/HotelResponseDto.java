package com.Sprint1.Sprint1.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelResponseDto {
    private String nombreUsuario;
    private Double total;
    private HotelReservaResponseDto hotelReservaResponseDto;
}
