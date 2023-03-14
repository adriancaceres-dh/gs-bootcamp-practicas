package com.example.AgenciaTurismo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PaymentMethodDto {
    private String type;
    private String number;
    private Integer dues;
}
