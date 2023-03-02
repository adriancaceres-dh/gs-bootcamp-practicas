package com.bootcamp.metrosCuadrados.Controller;

import com.bootcamp.metrosCuadrados.Dto.HabitacionDto;
import com.bootcamp.metrosCuadrados.Dto.PropiedadDto;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropiedadInmobiliariaController {

    // Métodos para calcular el área y valor total
    @PostMapping("/Inmobiliaria")
    public ResponseEntity<String> calcularM2total(@RequestBody PropiedadDto propiedadDto) {
        System.out.println(propiedadDto);

        String respuesta = " ";

        try {
            double metrosCuadrados = 0.0;
            for (HabitacionDto habitacionDto : propiedadDto.getHabitaciones()) {
                metrosCuadrados += habitacionDto.calcularArea();
                respuesta = "Los metros cuadrados son " + metrosCuadrados;
            }
            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            respuesta = "No se pudo calcular los metros cuadrados";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/Valor")
    public ResponseEntity<String> totalPropiedad(@RequestBody PropiedadDto propiedadDto) {
        String respuesta = " ";

        try {
            double valorPropiedad = 0.0;
            double valorm2 = 800;
            for (HabitacionDto habitacionDto : propiedadDto.getHabitaciones()) {
                valorPropiedad += habitacionDto.calcularArea() * valorm2;
                respuesta = "El valor de la propiedad es de $" + valorPropiedad;
            }
            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            respuesta = "No se pudo calcular el valor de la propiedad";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }
    }

    // Método para buscar la habitación más grande
    @PostMapping("/grande")
    public ResponseEntity<String> habitacionGrande(@RequestBody PropiedadDto propiedadDto) {
        String respuesta = " ";

        try {
            double metrosCuadrados = 0.0;
            HabitacionDto habitacionMasGrande = propiedadDto.getHabitaciones().get(0);

            for (HabitacionDto habitacionDto : propiedadDto.getHabitaciones()) {
                if (habitacionDto.calcularArea() > habitacionMasGrande.calcularArea()) {
                    habitacionMasGrande = habitacionDto;
                }
            }

            respuesta = "La habitacion mas grande es " + habitacionMasGrande.getNombre();
            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            respuesta = "No se pudo calcular el valor de la propiedad";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }
    }

    // Método para calcular los metros cuadrados por habitación
    @PostMapping("/habitacionm2")
    public ResponseEntity<String> m2PorHabitacion(@RequestBody PropiedadDto propiedadDto) {
        String respuesta = " ";

        try {
            for (HabitacionDto habitacionDto : propiedadDto.getHabitaciones()) {
                double metrosCuadrados = habitacionDto.calcularArea();
                respuesta += "Los metros cuadrados de la habitación: " + habitacionDto.getNombre() + " son " + metrosCuadrados + "\n";
            }
            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            respuesta = "No se pudo calcular los metros cuadrados";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }

    }
}