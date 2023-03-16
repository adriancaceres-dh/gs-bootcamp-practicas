package com.Sprint1.Sprint1.utils;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import com.Sprint1.Sprint1.model.HotelObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelFactory {
    public static HotelObject listaDeHotelesTest() {

                return HotelObject.builder()
                .codigoHotel("CH-0002")
                .nombre("Cataratas Hotel")
                .lugarCiudad("Puerto Iguazú")
                .tipoDeHabitacion("Doble")
                .precioPorNoche(6300.00)
                .disponibleDesde(LocalDate.of(2022, 2, 10))
                .disponibleHasta(LocalDate.of(2022, 3, 20))
                .reservado(false)
                .build();


    }

}
