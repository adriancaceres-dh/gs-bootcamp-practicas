package com.propiedades.propiedades.controller;

import com.propiedades.propiedades.dto.HabitacionDto;
import com.propiedades.propiedades.dto.PropiedadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraPropiedades {
    @PostMapping("/obtenerDatosPropiedad")
    public ResponseEntity<String> calcularDatos(@RequestBody PropiedadDto propiedadDto) {
        String respuesta = "";
        try {
            double totalMetros = 0;
            double habitacionMayor = 0;
            String habitaicionMasGrande = "";
            for (HabitacionDto habitacionDto : propiedadDto.getHabitaciones()) {
                totalMetros += habitacionDto.getAncho() * habitacionDto.getLargo();
                double habitacionActual = habitacionDto.getAncho() * habitacionDto.getLargo();
                if (habitacionMayor < habitacionActual) {
                    habitacionMayor = habitacionActual;
                    habitaicionMasGrande = habitacionDto.getNombre();
                }
                double metrosTotales = totalMetros;
                respuesta = "La cantidad de metros cuadrados es: " + metrosTotales + "\nEl valor de la propiedad es: $" +
                        metrosTotales * 800 + " " + "dolares" + "\nLa habitacion mas grande  tiene " + habitacionMayor +
                        " metros cuadrados y es " + habitaicionMasGrande + "\n" + propiedadDto.toString();

            }
        } catch (Exception e) {
            respuesta = "No hay habitaciones para poder calcular";
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);


    }


}