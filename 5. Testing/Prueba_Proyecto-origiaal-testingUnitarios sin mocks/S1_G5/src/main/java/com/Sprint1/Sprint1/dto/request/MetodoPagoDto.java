package com.Sprint1.Sprint1.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MetodoPagoDto {
    private String tipo;
    private String numero;
    private Integer cuotas;

}
