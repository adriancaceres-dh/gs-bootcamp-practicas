package com.Sprint1.Sprint1.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VueloRequestDto {
    private String nombreUsuario;
    private VueloReservaDto vueloReserva;
}
