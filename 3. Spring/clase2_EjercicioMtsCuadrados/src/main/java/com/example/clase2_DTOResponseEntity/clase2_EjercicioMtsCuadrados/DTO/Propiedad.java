package com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO;

import java.util.List;

public class Propiedad {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

}
