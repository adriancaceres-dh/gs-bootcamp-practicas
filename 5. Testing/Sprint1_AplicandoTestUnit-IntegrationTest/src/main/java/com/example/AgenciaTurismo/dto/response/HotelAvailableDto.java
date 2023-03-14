package com.example.AgenciaTurismo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelAvailableDto {
    private String codigoHotel;
    private String nombre;
    private String lugar;
    private String tipoHabitacion;
    private Double precioNoche;
    private LocalDate disponibleDesde;
    private LocalDate disponibleHasta;
    private Boolean reservado;

}
