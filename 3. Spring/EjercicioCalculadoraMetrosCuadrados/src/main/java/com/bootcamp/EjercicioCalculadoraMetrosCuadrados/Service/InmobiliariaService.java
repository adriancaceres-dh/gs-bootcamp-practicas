package com.bootcamp.EjercicioCalculadoraMetrosCuadrados.Service;

import com.bootcamp.EjercicioCalculadoraMetrosCuadrados.dto.PropiedadDto;

public interface InmobiliariaService {
    public String cantidadM2(PropiedadDto p);

    public String precioPropiedad(PropiedadDto p);

    public String habitacionGrande(PropiedadDto p);

    public String habitacion(PropiedadDto p);
}
