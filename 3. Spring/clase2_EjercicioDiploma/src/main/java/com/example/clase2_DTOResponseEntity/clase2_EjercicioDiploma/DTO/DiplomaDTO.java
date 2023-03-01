package com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO;

public class DiplomaDTO extends EstudianteDTO{
    private String mensaje;
    private Double promedio;
    private EstudianteDTO estudiante;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double aDouble) {
        promedio = estudiante.calcularPromedio(estudiante);
    }

    public EstudianteDTO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    public DiplomaDTO() {
    }

    public DiplomaDTO(String mensaje, Double promedio, EstudianteDTO estudiante) {
        this.mensaje = mensaje;
        this.promedio = promedio;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "DiplomaDTO{" +
                "mensaje='" + mensaje + '\'' +
                ", promedio=" + promedio +
                ", estudiante=" + estudiante +
                '}';
    }
}
