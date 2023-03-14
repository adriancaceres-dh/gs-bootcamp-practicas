package com.ejercicioConstructora.Constructora.controller;
import com.ejercicioConstructora.Constructora.Dto.HabitacionesDto;
import com.ejercicioConstructora.Constructora.Dto.PropiedadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculadoraConstructora {
    @PostMapping("/obtenerDatosPropiedad")
    public ResponseEntity<String> calcularDatos(@RequestBody PropiedadDto propiedadDto){
        String respuesta = "";
        try {
            double totalMetros = 0;
            double habitacionMayor = 0;
            String habitaicionMasGrande = "";
            for (HabitacionesDto habitacionesDto : propiedadDto.getHabitaciones()){
                totalMetros+= habitacionesDto.getAncho()* habitacionesDto.getLargo();
                double habitacionActual =  habitacionesDto.getAncho()* habitacionesDto.getLargo();
                if(habitacionMayor<habitacionActual){
                    habitacionMayor = habitacionActual;
                    habitaicionMasGrande = habitacionesDto.getNombre();
                }
            } double metrosTotales = totalMetros;
            respuesta =
                    "La propiedad con nombre '" + propiedadDto.getNombre() + "' tiene un total de " + metrosTotales + " metros cuadrados."+
                    "\nEl valor de la propiedad es: $" + metrosTotales*800 + " " + "dolares" +
                    "\nLa habitacion mas grande tiene " + habitacionMayor + " metros cuadrados y es " +habitaicionMasGrande +
                    "\n" + propiedadDto.toString();
        } catch(Exception e) {
            respuesta = "No hay habitaciones para poder calcular";
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
