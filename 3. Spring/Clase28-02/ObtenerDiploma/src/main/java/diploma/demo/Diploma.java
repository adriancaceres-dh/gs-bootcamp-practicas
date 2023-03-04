package diploma.demo;

import java.util.List;

public class Diploma {
    private String alumno;
    private double promedio;
    private String mensaje;

    public Diploma(String alumno) {
        this.alumno = alumno;
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
    
    public void calcularPromedio(List<Asignatura> asignaturas) {
        double promedio = 0.00;
        int cantidad = 0;
        for (Asignatura asignatura : asignaturas) {
            promedio = promedio + asignatura.getNota();
            cantidad++;
        }
        this.setPromedio(promedio/cantidad);
    }

    public void saludo() {
        if(this.getPromedio() >= 9) {
            this.setMensaje("Felicitaciones, buen promedio");
        }

    }
}
