package com.Bootcamp.Spring1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class HotelModel {
    private String codeHotel;
    private String name;
    private String city;
    private String roomTipe;
    private Double price;
    private LocalDate availableFromDate;
    private LocalDate availableUntilDate;
    private Boolean reserved;

    // Tenemos que generar nro (id) reserva?
}
