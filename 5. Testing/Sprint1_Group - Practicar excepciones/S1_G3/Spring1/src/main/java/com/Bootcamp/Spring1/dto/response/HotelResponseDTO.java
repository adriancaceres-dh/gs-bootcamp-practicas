package com.Bootcamp.Spring1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class HotelResponseDTO {
    public String mensaje = "El monto total de la reserva es de ";
    private Double total;

}
