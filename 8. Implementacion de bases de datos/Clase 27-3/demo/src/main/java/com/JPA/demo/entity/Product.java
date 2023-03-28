package com.JPA.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity // indica a springboot que esto es el equivalente a una tabla de BBDD
@Table(name = "producto") // Indica propiedades especiales de la tabla
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permite que se genere un id
    private Integer id;

    @Column(name = "nombreProducto", nullable = false, length = 40)
    private String name;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String description;
}
