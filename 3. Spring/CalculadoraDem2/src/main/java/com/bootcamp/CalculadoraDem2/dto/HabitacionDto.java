package com.bootcamp.CalculadoraDem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionDto {

    //atributos de la habitacion
    private String nombre;

    private Double largo;

    private Double ancho;

    //metodo para calcular la superficie de la habitacion
    public double calculoSuperficie(){
        double superficie = 0;
        if(this.largo !=0 && this.ancho!=0){
            superficie = this.largo * this.ancho;
        }
        return superficie;
    }
}
