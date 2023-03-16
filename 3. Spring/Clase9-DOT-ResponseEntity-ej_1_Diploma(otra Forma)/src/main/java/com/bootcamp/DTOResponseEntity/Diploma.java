package com.bootcamp.DTOResponseEntity;

public class Diploma {
    public static String generarMensaje(Alumno alumno) {
        double promedio = alumno.calcularPromedio();
        return "¡Felicitaciones " + alumno.getNombre() + "! Su promedio durante la carrera es de " + promedio;
    }
}
