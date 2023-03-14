package com.Bootcamp.Spring1.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlyResponseDTO {
    public String mensaje = "El monto total del vuelo es de: ";
    private Integer total;
}
