package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.model;

import lombok.*;

import java.time.LocalDate;

//Esto es la ENTIDAD DE DOMINIO - tiene todos los datos, logica y demás que vienen de la BD o reposity. LOS DTO van a tener info mas limitada.

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntradaBlog {
    private int id; //no es necesario que nos lo envien. Lo vamos a generar nosotros.
    private String title; //necesitamos que lo envien. LO VAMOS A RECIBIR POR EL DTO
    private String nameAuthor; //necesitamos que lo envien. LO VAMOS A RECIBIR POR EL DTO
    private LocalDate date; //no es necesario que nos lo envien. Lo vamos a generar nosotros.

}
