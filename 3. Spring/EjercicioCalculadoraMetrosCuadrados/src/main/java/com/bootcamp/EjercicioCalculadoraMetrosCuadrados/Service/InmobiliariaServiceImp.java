package com.bootcamp.EjercicioCalculadoraMetrosCuadrados.Service;

import com.bootcamp.EjercicioCalculadoraMetrosCuadrados.dto.HabitacionDto;
import com.bootcamp.EjercicioCalculadoraMetrosCuadrados.dto.PropiedadDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class InmobiliariaServiceImp implements InmobiliariaService{

    @Override
    public String cantidadM2(PropiedadDto p) {
        return "Cantidad m2 por propiedad " + p.cantidadM2Total();
    }

    @Override
    public String precioPropiedad(PropiedadDto p) {
        return "Precio total de la propiedad " + p.cantidadM2Total() * 800;
    }

    @Override
    public String habitacionGrande(PropiedadDto p) {
        HabitacionDto habitacionGrande = new HabitacionDto("primera", 0.0, 0.0);

        for (HabitacionDto habitacion : p.getHabitaciones()) {
            if(habitacion.cantidadM2() > habitacionGrande.cantidadM2()) {
                habitacionGrande = habitacion;
            }
        }
        return "La habitacion mas grande es " + habitacionGrande.getNombre() + ", con un tamaño de " + habitacionGrande.cantidadM2() + "m2.";
    }



    public String habitacion(PropiedadDto p) {
        String habitaciones = "La propiedad " + p.getNombre() + ":\n";
        for (HabitacionDto habitacion : p.getHabitaciones()) {
            habitaciones += "La habitacion " + habitacion.getNombre() + " tiene " + habitacion.cantidadM2() + "m2.\n" ;
        }
        return habitaciones;
    }
}
