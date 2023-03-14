package com.Bootcamp.Spring1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class PaymentsDTO {
    private String type; // Tipo de tarjeta
    private String number; // Numero tarjeta
    private Integer dues; // Cantidad de cuotas
}
