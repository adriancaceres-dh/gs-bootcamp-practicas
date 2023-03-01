package com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO;

public class AsignaturaDTO {
    private String nombre;
    private Double nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    public AsignaturaDTO() {
    }

    public AsignaturaDTO(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AsignaturasDTO{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
