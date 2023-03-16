package com.Sprint1.Sprint1.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HotelObject {
    private String codigoHotel;
    private String nombre;
    private String lugarCiudad;
    private String tipoDeHabitacion;
    private Double precioPorNoche;
    private LocalDate disponibleDesde;
    private LocalDate disponibleHasta;
    private boolean reservado;

}
