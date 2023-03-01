package com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.service;

import com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO.Habitacion;
import com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO.Propiedad;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Calculos {

    public Double calcularMtsHabitaciones(Habitacion habitacion){
        return habitacion.getLargo() * habitacion.getAncho();
    }

    public Double calcularMtsCuadrados(Propiedad casa){
        List<Habitacion> habitaciones = casa.getHabitaciones();
        Double suma = 0.0;

        for (Habitacion habitacion : habitaciones){
            suma += calcularMtsHabitaciones(habitacion);
        }

        return suma;
    }

    public Double calcularValor(Propiedad casa){
        return calcularMtsCuadrados(casa) * 800;
    }

    public Habitacion habMasGrande(Propiedad casa){
        List<Habitacion> habitaciones = casa.getHabitaciones();
        Double valorMaximo = 0.0;
        Habitacion habMasGrande = null;

        for (Habitacion habitacion : habitaciones) {
            if(calcularMtsHabitaciones(habitacion) > valorMaximo){
                valorMaximo = calcularMtsHabitaciones(habitacion);
                habMasGrande = habitacion;
            }
        }

        return habMasGrande;
    }
}
