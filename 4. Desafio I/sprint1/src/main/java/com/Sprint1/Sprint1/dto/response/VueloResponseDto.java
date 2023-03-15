package com.Sprint1.Sprint1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VueloResponseDto {
    private String userName;
    private Double total;
    private VueloReservaResponseDto vueloReservaResponseDto;
}
