package com.example.clase2_DTOResponseEntity.clase2_EjercicioMtsCuadrados.DTO;

public class Response {
    private Double mtsCuadrados;
    private Double precio;
    private Habitacion habGrande;

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

    public Response(Double mtsCuadrados, Double precio, Habitacion habGrande) {
        this.mtsCuadrados = mtsCuadrados;
        this.precio = precio;
        this.habGrande = habGrande;
    }

    public Response() {
    }

    @Override
    public String toString() {
        return "Response{" +
                "mtsCuadrados=" + mtsCuadrados +
                ", precio=" + precio +
                ", habGrande=" + habGrande +
                '}';
    }
}
