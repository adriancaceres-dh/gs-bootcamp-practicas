package com.bootcamp.CalculadoraDem2.servicios;

import com.bootcamp.CalculadoraDem2.dto.CasaDto;
import com.bootcamp.CalculadoraDem2.dto.HabitacionDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Calculos {

    //metros cuadrados de cada habitacion
    public Double calculoM2Habitacion(HabitacionDto habitacion){
        Double superficie = habitacion.getAncho() * habitacion.getAncho();

        return superficie;
    }

    //calculamos los m2 de la casa sumando de cada una de las habitaciones
    public Double calculoM2Casa (CasaDto casa){
        List<HabitacionDto> habitaciones = new ArrayList<>(); //llamamos al atributo de la clase
        Double total = 0.0;

        for (HabitacionDto habitacion : habitaciones){
            total += calculoM2Habitacion(habitacion);
        }

        return total;
    }

    //valor total de la propiedad 800usd el m2
    public Double valorPropiedad (CasaDto casa){
        Double valorTotal = calculoM2Casa(casa) * 800;
        return valorTotal;
    }

    //habitacion mas grande
    public HabitacionDto habitacionMasGrande (CasaDto casa){
        List<HabitacionDto> listaHabitaciones = new ArrayList<>();
        Double valorMax = 0.0;
        HabitacionDto habMaxima = null;

        for (HabitacionDto habitacion : listaHabitaciones){
            if(calculoM2Habitacion(habitacion) > valorMax){
                valorMax = calculoM2Habitacion(habitacion);
                habMaxima = habitacion;
            }
        }

        return habMaxima;
    }

}
