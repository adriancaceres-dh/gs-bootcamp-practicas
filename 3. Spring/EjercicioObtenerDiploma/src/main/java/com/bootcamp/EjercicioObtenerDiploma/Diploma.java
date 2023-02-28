package com.bootcamp.EjercicioObtenerDiploma;

public class Diploma {
    private String alumno;
    private double promedio;
    private String mensaje;

    public Diploma(String alumno, double promedio, String mensaje) {
        this.alumno = alumno;
        this.promedio = promedio;
        this.mensaje = mensaje;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
