package com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO;

import java.util.List;

public class Response {
    private Double mtsCuadrados;
    private Double precio;
    private Habitacion habGrande;
    private List<Habitacion> habitaciones;

    public Double getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(Double mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Habitacion getHabGrande() {
        return habGrande;
    }

    public void setHabGrande(Habitacion habGrande) {
        this.habGrande = habGrande;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Response() {
    }

    public Response(Double mtsCuadrados, Double precio, Habitacion habGrande, List<Habitacion> habitaciones) {
        this.mtsCuadrados = mtsCuadrados;
        this.precio = precio;
        this.habGrande = habGrande;
        this.habitaciones = habitaciones;
    }
}
