package com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDTO{

    private String nombre;
    private List<AsignaturaDTO> asignaturasAprobadas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<AsignaturaDTO> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public void setAsignaturasAprobadas(List<AsignaturaDTO> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    public EstudianteDTO() {
    }

    public EstudianteDTO(String nombre, List<AsignaturaDTO> asignaturasAprobadas) {
        this.nombre = nombre;
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    public Double calcularPromedio(EstudianteDTO estudiante) {
        List<AsignaturaDTO> arrayNotas = estudiante.getAsignaturasAprobadas();
        //List<Double> notasAsignaturasAprobadas = new ArrayList<>();
        Double sumaNotas = 0.0;
        Integer sumatoria = 0;

        for (AsignaturaDTO asignatura : arrayNotas) {
            //notasAsignaturasAprobadas.add(asignatura.getNota());
            sumaNotas += asignatura.getNota();
            sumatoria++;
        }

        return sumaNotas / sumatoria;

    }

    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "nombre='" + nombre + '\'' +
                ", asignaturasAprobadas=" + asignaturasAprobadas +
                '}';
    }
}
