package com.Sprint1.Sprint1.utils;

import com.Sprint1.Sprint1.model.HotelObject;
import com.Sprint1.Sprint1.model.VuelosObject;

import java.time.LocalDate;

public class VueloFactory {

    public static VuelosObject listaDeVuelosTest() {

        return VuelosObject.builder()
                .nroVuelo("BAPI-1235")
                .origen("Buenos Aires")
                .destino("Puerto Iguazú")
                .tipoAsiento("Economy")
                .precioPorPersona(6500.00)
                .fechaIda(LocalDate.of(2022, 2, 10))
                .fechaVuelta(LocalDate.of(2022, 2, 15))
                .build();


    }

}
